package com.cpf.patterns.null_object;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
