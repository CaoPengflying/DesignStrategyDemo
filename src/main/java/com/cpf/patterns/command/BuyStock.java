package com.cpf.patterns.command;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class BuyStock implements Order {
    private Stock stock;
    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.buy();
    }
}
