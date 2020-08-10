package com.cpf.patterns.prototype;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class Rectangle extends Shape {
    public Rectangle() {
        this.setType("rectangle");
    }

    @Override
    void draw() {
        System.out.println("画一个圆形");
    }
}
