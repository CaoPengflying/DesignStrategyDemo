package com.cpf.patterns.command;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class BrokerTest {
    public static void main(String[] args) {
        Stock abc = new Stock();
        BuyStock buyStock = new BuyStock(abc);
        SellStock sellStock = new SellStock(abc);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrder();


    }
}
