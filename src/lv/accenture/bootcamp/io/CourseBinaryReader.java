package lv.accenture.bootcamp.io;

import lv.accenture.bootcamp.io.model.Course;
import lv.accenture.bootcamp.io.model.Lection;
import lv.accenture.bootcamp.io.model.Student;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CourseBinaryReader {

    public static void main(String[] args) throws Exception {
        File file = new File("students.data");
        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        String courseName = readString(dataInputStream);
        String teacherName = readString(dataInputStream);
        String dateFormat = readString(dataInputStream);
        int studentCount = dataInputStream.readInt();
        int lectionCount = dataInputStream.readInt();

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            String studentFirstName = readString(dataInputStream);
            String studentLastName = readString(dataInputStream);
            byte studentAge = dataInputStream.readByte();
            String practiseCompany = readString(dataInputStream);

            List<Lection> dailyReports = new ArrayList<>(lectionCount);
            for (int j = 0; j < lectionCount; j++) {
                long date = dataInputStream.readLong();
                boolean presence = dataInputStream.readBoolean();
                byte rawMark = dataInputStream.readByte();
                Lection dailyReport = new Lection(
                        date, presence, rawMark != -1 ? rawMark : null
                );
                dailyReport.setFormatter(new SimpleDateFormat(dateFormat));
                dailyReports.add(dailyReport);

            }

            Student student = new Student(studentFirstName, studentLastName, studentAge, practiseCompany, dailyReports);
            students.add(student);
         }

        Course course = new Course(courseName, teacherName, dateFormat, students);
        System.out.println("course = " + course);
    }

    private static String readString(DataInputStream dataInputStream) throws IOException {
        int courseNameLength = dataInputStream.readInt();
        byte[] courseNameBytes = new byte[courseNameLength];
        dataInputStream.read(courseNameBytes);
        return new String(courseNameBytes, StandardCharsets.US_ASCII);
    }


}
