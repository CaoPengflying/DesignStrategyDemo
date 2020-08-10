package com.cpf.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class Employee {
    private String name;
    private String dept;
    private Integer salary;
    List<Employee> employeeList;

    public Employee(String name, String dept, Integer salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.employeeList = new ArrayList<Employee>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", employeeList=" + employeeList +
                '}';
    }
}
