package com.cpf.patterns.builder;

/**
 * date 2020/7/8
 *
 * @author caopengflying
 */
public class ChickenBurger extends Burger {
    public String name() {
        return "chicken burger";
    }

    public float price() {
        return 25f;
    }
}
