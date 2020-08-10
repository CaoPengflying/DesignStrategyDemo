package com.cpf.patterns.template;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public abstract class Game {
    abstract void init();

    abstract void start();

    abstract void end();

    public final void play() {
        init();
        start();
        end();
    }
}
