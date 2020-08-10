package com.cpf.patterns.bridge;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public abstract class Shape {
    Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    abstract void draw();
}
