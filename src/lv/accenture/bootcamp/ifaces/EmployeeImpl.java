package lv.accenture.bootcamp.ifaces;

import java.util.Random;

public class EmployeeImpl implements Employee, Animal {

    private String name;

    public EmployeeImpl (String name) {
        this.name = name;
    }

    public boolean work(int hours) {
        int r = new Random().nextInt(24);
        return r > hours;
    }

    public String getName() {
        return name;
    }

    @Override
    public void speak() {
        System.out.println("When friday?");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}
