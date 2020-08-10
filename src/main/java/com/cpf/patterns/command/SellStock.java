package com.cpf.patterns.command;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.sell();
    }
}
