package com.cpf.patterns.memento;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
