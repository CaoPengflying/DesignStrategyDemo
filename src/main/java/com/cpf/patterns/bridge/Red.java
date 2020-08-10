package com.cpf.patterns.bridge;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class Red implements Color {
    public void paint(String shape) {
        System.out.println("red 的" + shape);
    }
}
