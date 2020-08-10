package com.cpf.patterns.command;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class Stock {
    private String name = "abc";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");
    }
}
