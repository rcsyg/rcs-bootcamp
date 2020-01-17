package lv.accenture.bootcamp.inheritance;

public class LazyDomesticCat extends DomesticCat {

    public LazyDomesticCat(String name) {
        super("Lazy " + name);
    }

    @Override
    public String toString() {
        return "Cat : " + getName();
    }
}
