package lv.accenture.bootcamp.ifaces;

public class Developer extends EmployeeImpl {

    public Developer(String name) {
        super(name);
    }

    @Override
    public boolean work(int hours) {
        return hours <= 8;
    }

}
