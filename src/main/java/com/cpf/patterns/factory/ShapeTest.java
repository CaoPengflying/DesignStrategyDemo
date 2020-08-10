package com.cpf.patterns.factory;

/**
 * date 2020/7/5
 *
 * @author caopengflying
 */
public class ShapeTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShapeByType(ShapeFactory.CIRCLE);
        circle.draw();

        Shape rectangle = shapeFactory.getShapeByType(ShapeFactory.RECTANGLE);
        rectangle.draw();

        Shape square = shapeFactory.getShapeByType(ShapeFactory.SQUARE);
        square.draw();

    }
}
