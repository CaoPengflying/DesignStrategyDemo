package com.cpf.patterns.decorator;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        drawBorder();
    }
    public void drawBorder(){
        System.out.println("画一个红色的边框");
    }
}
