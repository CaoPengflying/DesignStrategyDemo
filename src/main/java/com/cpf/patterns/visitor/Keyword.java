package com.cpf.patterns.visitor;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public class Keyword implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
