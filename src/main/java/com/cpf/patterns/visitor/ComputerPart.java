package com.cpf.patterns.visitor;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
