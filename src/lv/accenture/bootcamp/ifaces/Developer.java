package lv.accenture.bootcamp.ifaces;

public class Developer extends EmployeeImpl {

    public final static int STANDARD_WORKING_DAY = 8;

    public Developer(String name) {
        super(name);
    }

    @Override
    public boolean work(int hours) {
        return hours <= STANDARD_WORKING_DAY;
    }

}
