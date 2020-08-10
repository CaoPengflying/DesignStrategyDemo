package com.cpf.patterns.visitor;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public class Computer implements ComputerPart {
    ComputerPart[] computerParts;

    public Computer() {
        this.computerParts = new ComputerPart[] {new Mouse(), new Keyword()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < computerParts.length; i++) {
            computerParts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
