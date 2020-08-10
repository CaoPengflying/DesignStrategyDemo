package com.cpf.patterns.bridge;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 * 桥接模式：
 * 一个抽象类中包含一个接口
 * 及自己的方法，自己的方法中调用接口的方法与自己的功能组合为一个功能
 *
 */
public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor(new Red());
        circle.draw();
    }
}
