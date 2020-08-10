package com.cpf.patterns.criteria;

import java.util.List;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public List<Person> meetCriteria(List<Person> list) {
        List<Person> people = criteria.meetCriteria(list);
        List<Person> people1 = otherCriteria.meetCriteria(list);
        for (Person person : people1) {
            if (!people.contains(person)) {
                people.add(person);
            }
        }
        return people;
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

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
}
