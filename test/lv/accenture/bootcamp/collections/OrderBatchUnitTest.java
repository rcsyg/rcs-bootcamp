package lv.accenture.bootcamp.collections;

import junit.framework.TestCase;

public class OrderBatchUnitTest extends TestCase {

    public void testAddOrder() {
        OrderBatch orderBatch = new OrderBatch();
        assertEquals(0, orderBatch.orders.size());
        orderBatch.addOrder(new Order("Xiaomi Redmi Note 8 Pro", "Vasya Pupkin", 1));
        assertEquals(1, orderBatch.orders.size());

        assertEquals(new Order("Xiaomi Redmi Note 8 Pro", "Vasya Pupkin", 1), orderBatch.orders.get(0));
    }



}
