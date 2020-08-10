package com.cpf.patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrder() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
