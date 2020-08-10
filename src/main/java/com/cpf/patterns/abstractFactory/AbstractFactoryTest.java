package com.cpf.patterns.abstractFactory;

/**
 * date 2020/7/7
 *
 * @author caopengflying
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstarctFacotry color_factory = FactoryProducer.getFactory("COLOR_FACTORY");
        Color red = color_factory.getColor("red");
        red.fill();

        AbstarctFacotry shape_factory = FactoryProducer.getFactory("SHAPE_FACTORY");
        Shape circle = shape_factory.getShape("circle");
        circle.draw();
    }
}
