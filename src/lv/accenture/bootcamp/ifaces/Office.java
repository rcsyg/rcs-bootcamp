package lv.accenture.bootcamp.ifaces;

public class Office {

    public static void main(String[] args) {
        Employee employee = new EmployeeImpl("Janis Berzinsh");
        System.out.println("Work done : " + employee.work(8)
         + " by employee " + employee.getName());
    }

}
