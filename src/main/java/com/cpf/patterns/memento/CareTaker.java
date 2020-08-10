package com.cpf.patterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();
    public void add(Memento memento){
        mementoList.add(memento);
    }
    public Memento getMemento(int index){
        return mementoList.get(index);
    }
}
