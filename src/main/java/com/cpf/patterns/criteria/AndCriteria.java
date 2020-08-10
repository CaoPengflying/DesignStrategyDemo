package com.cpf.patterns.criteria;

import java.util.List;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    public List<Person> meetCriteria(List<Person> list) {
        List<Person> people = criteria.meetCriteria(list);
        return otherCriteria.meetCriteria(people);
    }

    public Criteria getCriteria() {
        return criteria;
    }

    public void setCriteria(Criteria criteria) {
        this.criteria = criteria;
    }

    public Criteria getOtherCriteria() {
        return otherCriteria;
    }

    public void setOtherCriteria(Criteria otherCriteria) {
        this.otherCriteria = otherCriteria;
    }
}
