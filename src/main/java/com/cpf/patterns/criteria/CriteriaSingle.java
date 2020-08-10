package com.cpf.patterns.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class CriteriaSingle implements Criteria {
    List<Person> personList = new ArrayList<Person>();

    public List<Person> meetCriteria(List<Person> list) {
        for (Person person : list) {
            if (person.getMaritalStatus().equalsIgnoreCase("single")) {
                personList.add(person);
            }
        }
        return personList;
    }
}
