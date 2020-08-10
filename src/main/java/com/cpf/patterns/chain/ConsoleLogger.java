package com.cpf.patterns.chain;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("console log " + message);
    }
}
