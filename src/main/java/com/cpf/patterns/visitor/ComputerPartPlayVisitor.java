package com.cpf.patterns.visitor;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public class ComputerPartPlayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Mouse mouse) {
        System.out.println("visit mouse");
    }

    @Override
    public void visit(Keyword keyword) {
        System.out.println("visit keyword");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("visit computer");
    }
}
