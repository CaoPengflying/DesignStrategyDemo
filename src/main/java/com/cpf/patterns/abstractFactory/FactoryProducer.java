package com.cpf.patterns.abstractFactory;

/**
 * date 2020/7/7
 *
 * @author caopengflying
 */
public class FactoryProducer {
    public static final String COLOR_FACTORY = "COLOR_FACTORY";
    public static final String SHAPE_FACTORY = "SHAPE_FACTORY";
    public static AbstarctFacotry getFactory(String choice){
        if (COLOR_FACTORY.equals(choice)){
            return new ColorFactory();
        }else if (SHAPE_FACTORY.equals(choice)){
            return new ShapeFactory();
        }
        return null;
    }
}
