package com.cpf.patterns.bridge;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class Circle extends Shape {
    @Override
    void draw() {
        color.paint("圆");
    }
}
