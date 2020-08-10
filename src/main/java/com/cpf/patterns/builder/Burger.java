package com.cpf.patterns.builder;

/**
 * date 2020/7/8
 *
 * @author caopengflying
 */
public abstract class Burger implements Item {
    public Packing packing() {
        return new Wrapper();
    }
}
