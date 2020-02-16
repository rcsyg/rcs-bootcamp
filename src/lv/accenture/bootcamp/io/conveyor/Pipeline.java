package lv.accenture.bootcamp.io.conveyor;

import lv.accenture.bootcamp.io.model.Course;

public class Pipeline {

    private BinaryConverter binaryConverter;
    private XMLConverter xmlConverter;
    private JSONConverter jsonConverter;

    public Pipeline () {
        binaryConverter = new BinaryConverter();
        xmlConverter = new XMLConverter();
        jsonConverter = new JSONConverter();
    }

    public void performConversions() throws Exception {
        Course course = binaryConverter.readFromFile("students.data");

        xmlConverter.writeToFile(course, "./documents/course-data.xml");
        Course xmlCourse = xmlConverter.readFromFile("./documents/course-data.xml");
        assert course.equals(xmlCourse) : "XML conversion step failed!";

        jsonConverter.writeToFile(xmlCourse, "./documents/course-json.json");
        Course jsonCourse = jsonConverter.readFromFile("./documents/course-json.json");
        assert course.equals(jsonCourse) : "JSON conversion step failed!";

    }


    public static void main(String[] args) throws Exception {
        Pipeline pipeline = new Pipeline();
        pipeline.performConversions();
    }

}
