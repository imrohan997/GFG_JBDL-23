package com.example.equalsAndHashCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * This is a class to demonstrates equals() method and hashcode method() in Java.
 * Key points-
 * 1.Default implementation of equals() in Object class wherein address of current object(this) and passed object(o) are compared
 * 2.If we override equals() method to provide own implementation to compare then we also need to override hashCode() method.
 * 3.equals() and hasCode() are overrided together because if two objects are equals then their hashCode also needs to be equal.
 * 4.This is so because imagine a scenerio wherein we are populating a HashMap with two Person(some class) object as key
 * and both are equal according to our logic of equals() so map should contain just 1 key but since hashmap is created
 * with the help of hashCode(), we will get 2 values in map.
 */
public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Map<Person, Integer> map = new HashMap<>();
        Person person1 = new Person(1, "Rohan", 25);
        Person person2 = new Person(1, "Rohan", 25);
        map.put(person1, 1);
        map.put(person2, 2);


        System.out.println();
        System.out.println(map); // Output: {Person{id=1, name='Rohan', age=25}=2}
        System.out.println(map.size()); // size is 1 since both persons are equal
        System.out.println(person1.equals(person2)); //result is true
    }
}
