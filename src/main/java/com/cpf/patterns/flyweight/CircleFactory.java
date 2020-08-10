package com.cpf.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * date 2020/6/27

 *
 * @author caopengflying
 */
public class CircleFactory {
    private static Map<String, Circle> circleMap = new HashMap<String, Circle>();

    public Shape getCircleByColor(String color){
        if (circleMap.containsKey(color)){
            return circleMap.get(color);
        }else {
            Circle circle = new Circle();
            circle.setColor(color);
            circleMap.put(color, circle);
            return circle;
        }
    }
}
