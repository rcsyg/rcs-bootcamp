package lv.accenture.bootcamp.io.conveyor;

import lv.accenture.bootcamp.io.model.Course;

public class Pipeline {

    private BinaryConverter binaryConverter;

    public Pipeline () {
        binaryConverter = new BinaryConverter();
    }

    public void performConversions() throws Exception {
        Course course = binaryConverter.readFromFile("students.data");
        // ./documents/students.xml
    }


    public static void main(String[] args) throws Exception {
        Pipeline pipeline = new Pipeline();
        pipeline.performConversions();
    }

}
