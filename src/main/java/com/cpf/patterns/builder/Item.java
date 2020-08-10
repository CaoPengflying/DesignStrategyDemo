package com.cpf.patterns.builder;

/**
 * date 2020/7/8
 *
 * @author caopengflying
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
