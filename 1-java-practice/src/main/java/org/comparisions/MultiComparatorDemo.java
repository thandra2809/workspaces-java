package org.comparisions;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class MultiComparatorDemo {
    public static void main(String[] args) {
        List<ComparatorPerson> persons = new ArrayList<>();

        persons.add(new ComparatorPerson("Umesh Awasthi", 35));
        persons.add(new ComparatorPerson("Robert Hickle", 55));
        persons.add(new ComparatorPerson("John Smith", 40));
        persons.add(new ComparatorPerson("David", 23));
        persons.add(new ComparatorPerson("David", 63));

        persons.sort(ComparatorPerson.COMPARE_BY_AGE);

        for (ComparatorPerson person : persons) {
            out.println("Person Name Sorted by Age is: " + person.getName());
        }

        out.println("######################################################");
        persons.sort(ComparatorPerson.COMPARE_BY_NAME);

        for (ComparatorPerson person : persons) {
            out.println("Person Name Sorted by Name  is: " + person.getName());
        }
    }
}