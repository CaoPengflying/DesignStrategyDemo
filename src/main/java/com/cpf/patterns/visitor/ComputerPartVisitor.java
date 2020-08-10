package com.cpf.patterns.visitor;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public interface ComputerPartVisitor {
     void visit(Mouse mouse);

     void visit(Keyword keyword);

     void visit(Computer computer);
}
