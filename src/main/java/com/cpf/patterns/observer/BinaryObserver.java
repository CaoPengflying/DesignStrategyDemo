package com.cpf.patterns.observer;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("binary string" + this.subject.getState());
    }
}
