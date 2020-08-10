package com.cpf.patterns.criteria;

import java.util.List;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> list);
}
