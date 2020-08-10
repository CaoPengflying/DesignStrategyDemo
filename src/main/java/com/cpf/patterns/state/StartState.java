package com.cpf.patterns.state;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("start ...");
        context.setState(this);
    }
}
