package com.cpf.patterns.state;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("stop ...");
        context.setState(this);
    }
}
