package com.cpf.patterns.abstractFactory;

/**
 * date 2020/7/7
 *
 * @author caopengflying
 */
public class ColorFactory implements AbstarctFacotry {
    public static final String RED = "red";
    public Shape getShape(String shape) {
        return null;
    }

    public Color getColor(String color) {
        if (RED.equals(color)){
            return new Red();
        }
        return null;
    }
}
