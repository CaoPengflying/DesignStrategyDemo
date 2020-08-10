package com.cpf.patterns.facade;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 *
 */
public class ShapeMakerTest {
    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
