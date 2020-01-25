package lv.accenture.bootcamp.enums;

public class CoffeeBar {

    class Cup {
        private CupSize size;

        public Cup(CupSize size) {
            this.size = size;
        }
    }

    public static void main(String[] args) {
        CoffeeBar coffeeBar = new CoffeeBar();
        Cup cup = coffeeBar.new Cup(CupSize.MEDIUM);

        System.out.println(cup.size + " : " + cup.size.getVolume());

    }


}
