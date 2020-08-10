package com.cpf.patterns.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * date 2020/7/11
 *
 * @author caopengflying
 */
public class CriteriaFemale implements Criteria {
    public List<Person> personList = new ArrayList<Person>();

    public List<Person> meetCriteria(List<Person> list) {
        for (Person person : list) {
            if (person.getGender().equalsIgnoreCase("female")) {
                personList.add(person);
            }
        }
        return personList;
    }
}
