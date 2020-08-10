package com.cpf.patterns.strategy;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public int exec(int a, int b){
        return strategy.doOperation(a, b);
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
