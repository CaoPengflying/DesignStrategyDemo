package com.cpf.patterns.interpreter;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
