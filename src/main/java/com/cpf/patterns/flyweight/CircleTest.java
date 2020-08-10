package com.cpf.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * date 2020/6/27
 * 享元模式
 * 享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。
 * 这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
 * 享元模式尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象。
 * @author caopengflying
 */
public class CircleTest {
    public static void main(String[] args) {
        CircleFactory circleFactory = new CircleFactory();
        String[] colors = {"白色","黑丝","蓝色"};
        for (int i = 0; i < 20; i++) {
            for (String color : colors) {
                int x = getRandomX();
                int y = getRandomY();
                Shape circleByColor = circleFactory.getCircleByColor(color);
                ((Circle)circleByColor).setX(x);
                ((Circle)circleByColor).setY(y);
                circleByColor.draw();
            }
        }

    }

    private static int getRandomY() {

        return new Random().nextInt(10);
    }

    private static int getRandomX() {
        return new Random().nextInt(10);
    }
}
