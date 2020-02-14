package lv.accenture.bootcamp.io.conveyor;

import lv.accenture.bootcamp.io.model.Course;

public class Pipeline {

    private BinaryConverter binaryConverter;
    private XMLConverter xmlConverter;

    public Pipeline () {
        binaryConverter = new BinaryConverter();
        xmlConverter = new XMLConverter();
    }

    public void performConversions() throws Exception {
        Course course = binaryConverter.readFromFile("students.data");
        xmlConverter.writeToFile(course, "./documents/course-data.xml");
        Course xmlCourse = xmlConverter.readFromFile("./documents/course-data.xml");
        System.out.println("xmlCourse = " + xmlCourse);
        // ./documents/students.xml
    }


    public static void main(String[] args) throws Exception {
        Pipeline pipeline = new Pipeline();
        pipeline.performConversions();
    }

}
