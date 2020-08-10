package com.cpf.patterns.factory;

/**
 * date 2020/7/5
 *
 * @author caopengflying
 */
public class ShapeFactory {
    public static String CIRCLE = "CIRCLE";
    public static String RECTANGLE = "RECTANGLE";
    public static String SQUARE = "SQUARE";

    public Shape getShapeByType(String type) {
        if (CIRCLE.equals(type)) {
            return new CircleShape();
        } else if (RECTANGLE.equals(type)) {
            return new Rectangle();
        } else if (SQUARE.equals(type)) {
            return new Square();
        } else {
            throw new RuntimeException("不符合条件的类型");
        }
    }
}
