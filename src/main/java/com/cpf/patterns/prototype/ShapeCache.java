package com.cpf.patterns.prototype;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class ShapeCache {
    private static Map<String, Shape> shapeMap = new ConcurrentHashMap<String, Shape>();

    public static Shape getShape(String id) {
        Shape shape = shapeMap.get(id);
        return (Shape) shape.clone();
    }
    public static void loadCache() {
        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
