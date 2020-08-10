package com.cpf.patterns.chain;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;

    }

    @Override
    protected void write(String message) {
        System.out.println("error logger " + message);
    }
}
