package com.cpf.patterns.builder;

/**
 * date 2020/7/8
 *
 * @author caopengflying
 */
public class VegBurger extends Burger {
    public String name() {
        return "veg burger";
    }

    public float price() {
        return 20f;
    }
}
