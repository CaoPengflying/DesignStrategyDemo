package com.cpf.patterns.state;

import javafx.scene.paint.Stop;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 * 状态模式
 * 在状态模式（State Pattern）中，类的行为是基于它的状态改变的。
 * 这种类型的设计模式属于行为型模式。
 *
 * 在状态模式中，我们创建表示各种状态的对象和一个行为随着状态对象改变而改变的 context 对象。
 */
public class StateTest {
    public static void main(String[] args) {
        Context context = new Context();

        State state = new StartState();
        state.doAction(context);

        State stop = new StopState();
        stop.doAction(context);

        System.out.println(context.getState());
    }
}
