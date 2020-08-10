package com.cpf.patterns.composite;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 * 组合模式（Composite Pattern），又叫部分整体模式，
 * 是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，
 * 用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
 * 与前端交互时，返回一个整体对象，对象中包含很多了明细,及主表
 * 这种也是组合模式
 * <p>
 * 这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee ceo = new Employee("zhang", "ceo", 40000);

        Employee td = new Employee("yi", "td", 20000);
        Employee pd = new Employee("shen", "pd", 20000);

        Employee java1 = new Employee("cao", "clerk", 10000);
        Employee java2 = new Employee("wang", "clerk", 10000);

        Employee ph1 = new Employee("chen", "clerk", 10000);
        Employee ph2 = new Employee("li", "clerk", 10000);

        ceo.getEmployeeList().add(td);
        ceo.getEmployeeList().add(pd);
        td.getEmployeeList().add(java1);
        td.getEmployeeList().add(java2);
        pd.getEmployeeList().add(ph1);
        pd.getEmployeeList().add(ph2);

        System.out.println(ceo);
        for (Employee headEmployee : ceo.getEmployeeList()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getEmployeeList()) {
                System.out.println(employee);
            }
        }

    }
}
