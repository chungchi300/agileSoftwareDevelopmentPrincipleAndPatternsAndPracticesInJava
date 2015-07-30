package com.learning.mock;

/**
 * Created by Administrator on 2015/7/30.
 */
public class Counter {
    private static Counter ourInstance = new Counter();

    public static Counter getInstance() {
        return ourInstance;
    }

    private Counter() {
    }

    public void checkOutAnOrder(Order order) {
        order.setOrderState("checkouted");
    }
}
