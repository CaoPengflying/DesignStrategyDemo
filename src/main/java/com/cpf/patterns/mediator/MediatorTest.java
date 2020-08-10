package com.cpf.patterns.mediator;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 * 中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。
 * 这种模式提供了一个中介类，该类通常处理不同类之间的通信，
 * 并支持松耦合，使代码易于维护。中介者模式属于行为型模式。
 */
public class MediatorTest {
    public static void main(String[] args) {
        User cpf = new User("cpf");

        User zzc = new User("zzc");

        cpf.showMessage("hello zzc");
        zzc.showMessage("hello cpf");

    }
}
