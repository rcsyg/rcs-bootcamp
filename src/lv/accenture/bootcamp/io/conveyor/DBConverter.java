package lv.accenture.bootcamp.io.conveyor;

import lv.accenture.bootcamp.db.DBUtil;
import lv.accenture.bootcamp.io.model.Course;
import lv.accenture.bootcamp.io.model.Lection;
import lv.accenture.bootcamp.io.model.Student;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;

public class DBConverter implements Converter {

    @Override
    public Course readFromFile(String path) throws Exception {
        return null;
    }

    @Override
    public void writeToFile(Course model, String path) throws Exception {
        cleanDatabase();

        Connection connection = null;
        try {
            connection = DBUtil.acquireConnection();

            Long courseId = insertCourseRecord(model, connection);
            for (Student student : model.getStudents()) {

                Long studentId = insertStudentRecord(connection, courseId, student);

                for (Lection lection : student.getDailyReports()) {
                    insertLectionRecord(connection, courseId, studentId, lection);
                }
            }

            Files.writeString(Paths.get(path), String.valueOf(courseId));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }

    }

    private Long insertStudentRecord(Connection connection, Long courseId, Student student) throws SQLException {
        Long studentId = null;
        String insertStudentSql = "insert into student(FIRST_NAME, LAST_NAME, AGE, PRACTISE_COMPANY) values (?,?,?,?)";
        PreparedStatement studentInsertStatement = connection.prepareStatement(
                insertStudentSql, Statement.RETURN_GENERATED_KEYS);
        studentInsertStatement.setString(1, student.getFirstName());
        studentInsertStatement.setString(2, student.getLastName());
        studentInsertStatement.setByte(3, student.getAge());
        studentInsertStatement.setString(4, student.getPractiseCompany());
        studentInsertStatement.executeUpdate();

        try (ResultSet generatedKeys = studentInsertStatement.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                studentId = generatedKeys.getLong(1);
            } else {
                throw new SQLException("Creating user failed, no ID obtained.");
            }
        }

        insertCourseStudentConnectionRecord(connection, courseId, studentId);
        return studentId;
    }

    private void insertCourseStudentConnectionRecord(Connection connection, Long courseId, Long studentId) throws SQLException {
        String insertCourseStudentSQL = "insert into course_student(COURSE_ID, STUDENT_ID) values (?,?)";
        PreparedStatement studentCourseInsertStatement = connection.prepareStatement(insertCourseStudentSQL);
        studentCourseInsertStatement.setLong(1, courseId);
        studentCourseInsertStatement.setLong(2, studentId);
        studentCourseInsertStatement.executeUpdate();
    }

    private void insertLectionRecord(Connection connection, Long courseId, Long studentId, Lection lection) throws SQLException {
        String insertLectionSQL = "insert into lection(COURSE_ID, STUDENT_ID, " +
                "LECTION_DTM, IS_PRESENT, MARK) values (?,?,?,?,?)";
        PreparedStatement lectionInsertStatement = connection.prepareStatement(insertLectionSQL);
        lectionInsertStatement.setLong(1, courseId);
        lectionInsertStatement.setLong(2, studentId);
        Timestamp timestamp = new Timestamp(lection.getDate());
        lectionInsertStatement.setTimestamp(3, timestamp);
        lectionInsertStatement.setBoolean(4, lection.getPresence());
        if(lection.getMark() != null) {
            lectionInsertStatement.setByte(5, lection.getMark());
        } else {
            lectionInsertStatement.setNull(5, Types.TINYINT);
        }

        lectionInsertStatement.executeUpdate();
    }

    private Long insertCourseRecord(Course model, Connection connection) throws SQLException {
        Long courseId = null;
        String sql = "insert into course(TITLE, TEACHER, DTF) values (?,?,?)";
        PreparedStatement statement = connection.prepareStatement(
                sql, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, model.getCourseName());
        statement.setString(2, model.getTeacher());
        statement.setString(3, model.getDateFormat());
        statement.executeUpdate();

        try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                courseId = generatedKeys.getLong(1);
            } else {
                throw new SQLException("Creating user failed, no ID obtained.");
            }
        }
        return courseId;
    }

    private void cleanDatabase() throws SQLException {
        Connection connection = null;
        try {
            connection = DBUtil.acquireConnection();

            connection.createStatement().executeUpdate("delete from lection");
            connection.createStatement().executeUpdate("delete from course_student");
            connection.createStatement().executeUpdate("delete from student");
            connection.createStatement().executeUpdate("delete from course");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(connection != null) {
                connection.close();
            }
        }
    }

}