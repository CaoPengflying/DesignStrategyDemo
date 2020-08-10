package com.cpf.patterns.flyweight;


/**
 * date 2020/6/27
 *
 * @author caopengflying
 */
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.printf("在x:%d,y:%d绘制了一个%s色的圆形\n", x, y, color);
    }
}
