package com.cpf.patterns.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class CriteriaMale implements Criteria {
    List<Person> personList = new ArrayList<Person>();

    public List<Person> meetCriteria(List<Person> list) {
        for (Person person : list) {
            if (person.getGender().equalsIgnoreCase("male")) {
                personList.add(person);
            }
        }
        return personList;
    }
}
