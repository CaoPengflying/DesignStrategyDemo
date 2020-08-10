package com.cpf.patterns.observer;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 * 观察者模式
 * 消息订阅模式
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexaObserver(subject);

        System.out.println("first state change");
        subject.setState(1);

        System.out.println("second state change");
        subject.setState(2);
    }
}
