package com.cpf.patterns.facade;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class ShapeMaker {
    Shape circle;
    Shape rectangle;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }

    void drawCircle(){
        circle.draw();
    }
    void drawRectangle(){
        rectangle.draw();
    }
}
