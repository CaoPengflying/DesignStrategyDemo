package com.cpf.patterns.interpreter;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class OrExpression implements Expression {
    Expression expression1;
    Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    public boolean interpret(String context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}
