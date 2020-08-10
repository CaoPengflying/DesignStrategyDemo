package com.cpf.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public class Subject {
    private List<Observer> observerList = new ArrayList<>();

    private int state;

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
}
