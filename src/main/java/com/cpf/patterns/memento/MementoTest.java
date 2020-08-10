package com.cpf.patterns.memento;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 * 备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。
 * 备忘录模式属于行为型模式。
 */
public class MementoTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getFromMemento(careTaker.getMemento(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getFromMemento(careTaker.getMemento(1));
        System.out.println("Second saved State: " + originator.getState());

    }
}
