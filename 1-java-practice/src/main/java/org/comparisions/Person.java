package org.comparisions;

public class Person{

    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

/*    public int compareTo(Person person) {
        return this.age > person.age ? 1 : this.age < person.age ? -1 : 0;
    }*/
}