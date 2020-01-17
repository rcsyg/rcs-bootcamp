package lv.accenture.bootcamp.ifaces;

public class Office {

    public static void main(String[] args) {
        Employee employee = new EmployeeImpl("Janis Berzinsh");
        System.out.println("Work done : " + employee.work(8)
         + " by employee " + employee.getName());

        Employee developer = new Developer("Vasya Pupkin");
        Employee manager = new Manager("Pupka Vasykin");
        Employee srDeveloper = new SrDeveloper("Jack Sparrow");

        System.out.println("developer.getName() = " + developer.getName());
        System.out.println("manager.getName() = " + manager.getName());
        System.out.println("srDeveloper.getName() = " + srDeveloper.getName());
    }

}
