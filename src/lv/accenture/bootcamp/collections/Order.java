package lv.accenture.bootcamp.collections;

public class Order {

    private String itemId; // Name of the item
    private String customer; // Name of the customer
    private int count; // Count of the requested items

    public Order(String itemId, String customer, int count) {
        this.itemId = itemId;
        this.customer = customer;
        this.count = count;
    }

    // TODO : don't forget create getters here!

    @Override
    public String toString() {
        return "Order{" +
                "itemId='" + itemId + '\'' +
                ", customer='" + customer + '\'' +
                ", count=" + count +
                "}\n";
    }
}
