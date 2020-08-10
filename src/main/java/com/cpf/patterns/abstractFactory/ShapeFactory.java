package com.cpf.patterns.abstractFactory;

/**
 * date 2020/7/7
 *
 * @author caopengflying
 */
public class ShapeFactory implements AbstarctFacotry {
    public static final String CIRCLE = "circle";

    public Shape getShape(String shape) {
        if (CIRCLE.equals(shape)) {
            return new Circle();
        }
        return null;
    }

    public Color getColor(String color) {
        return null;
    }
}
