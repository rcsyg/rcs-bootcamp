package lv.accenture.bootcamp.io.xml;

import java.util.List;

public class DomesticAnimal {

    private String type;
    private String name;
    private List<String> toys;

    public DomesticAnimal(String type, String name, List<String> toys) {
        this.type = type;
        this.name = name;
        this.toys = toys;
    }

    @Override
    public String toString() {
        return "DomesticAnimal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
