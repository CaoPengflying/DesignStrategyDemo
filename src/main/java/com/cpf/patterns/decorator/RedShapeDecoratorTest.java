package com.cpf.patterns.decorator;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 * 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，
 * 同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
 *
 * 这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。
 */
public class RedShapeDecoratorTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        ShapeDecorator shapeDecorator = new ShapeDecorator(circle);
        shapeDecorator.draw();

        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        redShapeDecorator.draw();
    }
}
