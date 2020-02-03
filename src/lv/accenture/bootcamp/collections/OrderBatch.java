package lv.accenture.bootcamp.collections;

import java.util.*;

public class OrderBatch {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {

    }

    public void remove(String itemName) {
        // Hint : use .iterator() approach
    }

    public List<Order> sortByCustomer() {
        List<Order> collectionToSort = new ArrayList<>(this.orders);

        // Implement sorting here

        return collectionToSort;
    }

    public List<Order> sortByItemId() {
        List<Order> collectionToSort = new ArrayList<>(this.orders);

        // Implement sorting here

        return collectionToSort;
    }

    public List<Order> filter(String containingString) {
        List<Order> collectionCopy = new ArrayList<>(this.orders);

        // Implement filtering here

        return collectionCopy;
    }

    public List<Order> getCustomerOrders(String customerName) {
        List<Order> result = new ArrayList<>();

        // Implement filtering here

        return result;
    }

    public Map<String, Integer> getMostPopularItems(int limit) {
        // TODO : don't forget change return statement with real results
        return Collections.emptyMap();
    }

}
