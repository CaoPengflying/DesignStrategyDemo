package com.cpf.patterns.observer;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("hexa string" + this.subject.getState());
    }
}
