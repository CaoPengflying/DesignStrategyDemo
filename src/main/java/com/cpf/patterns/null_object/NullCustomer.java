package com.cpf.patterns.null_object;

/**
 * date 2020/7/12
 *
 * @author caopengflying
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "not available customer in database";
    }
}
