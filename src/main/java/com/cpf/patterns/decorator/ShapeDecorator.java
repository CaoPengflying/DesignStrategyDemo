package com.cpf.patterns.decorator;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class ShapeDecorator {
    Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }

}
