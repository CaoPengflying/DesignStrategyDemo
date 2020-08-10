package com.cpf.patterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * date 2020/7/8
 *
 * @author caopengflying
 */
public class Meal {
    List<Item> itemList = new ArrayList<Item>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public float getCost() {
        float cost = 0;
        for (Item item : itemList) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : itemList) {
            System.out.println("item" + item.name());
            System.out.println("packing" + item.packing().pack());
            System.out.println("price" + item.price());
        }
    }
}
