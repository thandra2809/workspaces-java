package org.comparisions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.lang.System.out;

public class Java8CompareExample {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Umesh Awasthi", 35));
        persons.add(new Person("Robert Hickle", 55));
        persons.add(new Person("John Smith", 40));
        persons.add(new Person("David", 23));
        persons.add(new Person("David", 63));

        persons.sort(Comparator.comparing(Person::getName).thenComparingInt(Person::getAge));

        for (Person person : persons) {
            out.println("Person Name is: " + person.getName() + ":: Age:" + person.getAge());
        }
        out.println("*********************************************");
        persons.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName));

        for (Person person : persons) {
            out.println("Person Name is: " + person.getName() + ":: Age:" + person.getAge());


        }


    }
}