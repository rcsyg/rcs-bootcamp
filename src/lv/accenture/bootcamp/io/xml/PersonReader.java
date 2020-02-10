package lv.accenture.bootcamp.io.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

public class PersonReader {

    public static void main(String[] args) throws Exception {
        SAXReader reader = new SAXReader();
        File personFile = new File("./documents/person-to-read.xml");
        Document document = reader.read(personFile);

        String personXml = document.asXML();
        System.out.println("personXml = " + personXml);

        Element personElement = document.getRootElement();
        Element surnameElement = personElement.element("surname");
        String surname = surnameElement.getText();
        System.out.println("surname = " + surname);

        String hamsterName = personElement
                .element("domesticAnimal")
                .element("name").getText();

        System.out.println("hamsterName = " + hamsterName);

        //Person person = new Person();
        System.out.println("person = " + person);
    }

}
