package lv.accenture.bootcamp.inheritance;

public class ZooLauncher {

    public static void main(String[] args) {
        AbstractCat abstractCat = new AbstractCat();
        //abstractCat.sleep();
        //abstractCat.speak();
        //abstractCat.groom();

        AbstractCat domesticCat = new DomesticCat("Prince");
        //System.out.println("Cat name : " + domesticCat.getName());
        //domesticCat.groom();

        domesticCat.sleep();
    }

}
