package com.cpf.patterns.abstractFactory;

/**
 * date 2020/7/7
 *
 * @author caopengflying
 */
public interface AbstarctFacotry {
    Shape getShape(String shape);
    Color getColor(String color);
}
