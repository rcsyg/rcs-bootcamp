package lv.accenture.bootcamp.ifaces;

import java.util.List;

public class Manager extends EmployeeImpl {

    private List<Developer> workers;

    private String name;

    public Manager(String name) {
        super(name);
    }

    @Override
    public boolean work(int hours) {
        return hours <= 6;
    }

    public String getName() {
        return name;
    }

    @Override
    public void speak() {

    }

    @Override
    public void sleep() {

    }
}
