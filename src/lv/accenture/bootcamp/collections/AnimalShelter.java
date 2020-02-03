package lv.accenture.bootcamp.collections;

import lv.accenture.bootcamp.inheritance.DomesticCat;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {

    public static void main(String[] args) {
        DomesticCat prince = new DomesticCat("Prince");
        DomesticCat muris = new DomesticCat("Muris");
        DomesticCat nikija = new DomesticCat("Nikija");

        List<DomesticCat> domesticCats = new ArrayList<>();
        domesticCats.add(prince);
        domesticCats.add(muris);
        domesticCats.add(nikija);

        System.out.println("domesticCats = " + domesticCats);

        boolean containsPrince = domesticCats.contains(prince);
        System.out.println("containsPrince = " + containsPrince);

        DomesticCat prince2 = new DomesticCat("Prince");
        boolean containsSame = domesticCats.contains(prince2);
        System.out.println("containsSame = " + containsSame);

        System.out.println(prince == prince2);
        System.out.println(prince.equals(prince2));
    }

}
