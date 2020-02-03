package lv.accenture.bootcamp.collections;

import java.util.*;

public class OrderBatch {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {

    }

    public List<Order> sortByCustomer() {
        // Implement sorting here

        return this.orders;
    }

    public List<Order> sortByItemId() {
        // Implement sorting here

        return this.orders;
    }

    public List<Order> filter(String containingString) {
        List<Order> collectionCopy = new ArrayList<>(this.orders);

        // Implement filtering here
        // Hint : use .iterator() approach

        return collectionCopy;
    }

    public List<Order> getCustomerOrders(String customerName) {
        List<Order> result = new ArrayList<>();

        // Implement extraction here

        return result;
    }

    public Map<String, Integer> getMostPopularItems(int limit) {
        // TODO : don't forget change return statement with real results
        return Collections.emptyMap();
    }

}
