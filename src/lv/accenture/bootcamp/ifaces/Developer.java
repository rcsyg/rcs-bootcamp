package lv.accenture.bootcamp.ifaces;

public class Developer extends EmployeeImpl {

    private String name;

    public Developer(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean work(int hours) {
        return hours <= 8;
    }

}
