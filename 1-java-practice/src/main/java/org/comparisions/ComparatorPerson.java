package org.comparisions;

import java.util.Comparator;

public class ComparatorPerson {

    private String name;
    private int age;

    public ComparatorPerson(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Comparator<ComparatorPerson> COMPARE_BY_NAME = new Comparator<ComparatorPerson>() {
        public int compare(ComparatorPerson one, ComparatorPerson other) {
            return one.name.compareTo(other.name);
        }
    };

    public static Comparator<ComparatorPerson> COMPARE_BY_AGE = new Comparator<ComparatorPerson>() {
        public int compare(ComparatorPerson one, ComparatorPerson other) {
            return one.age > other.age ? 1 : one.age < other.age ? -1 : 0;
        }
    };
}