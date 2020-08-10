package com.cpf.patterns.interpreter;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public interface Expression {

    boolean interpret(String context);
}
