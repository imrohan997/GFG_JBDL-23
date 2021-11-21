package com.geeksforgeeks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Person {

    private int age;
    private String name;
    private String country;

    public Person(int age, String name, String country) {
        this.age = age;
        this.name = name;
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return name;

    }

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person(20, "John", "USA"),
                new Person(35, "Sam", "Italy"),
                new Person(15, "Jamie", "England"),
                new Person(30, "Robert", "Italy"),
                new Person(20, "James", "Ireland"),
                new Person(25, "Peter", "USA"),
                new Person(5, "Jessica", "Norway"),
                new Person(40, "Roger", "Netherlands"),
                new Person(50, "Jim", "USA")
        );

        //Question 1
        OptionalDouble avgAge = people.stream().mapToInt(p -> p.getAge()).average();
        System.out.println("Average Age" + avgAge);

        //Question 2
        List<Person> res = people.stream().filter(p -> {
                    int age = p.getAge();
                    String name = p.getName();
                    if (age > 20 || name.contains("A") || name.contains("E") || name.contains("I") || name.contains("O") || name.contains("U") || name.contains("a") || name.contains("e") || name.contains("i") || name.contains("o") || name.contains("u")) {
                        return true;
                    }
                    return false;
                }
        ).collect(Collectors.toList());

        System.out.println("Result---->");
        for (Person person : res) {
            System.out.println(person.getName());
        }

        System.out.println("Sorted list---->");
        //Question3
        List<Person> sortedList = people.stream().sorted((p1, p2) -> {
            if (p1.getAge() == p2.getAge()) {
                return p2.getName().compareTo(p1.getName());
            }
            return p1.getAge() - p2.getAge();
        }).collect(Collectors.toList());

        for (Person person : sortedList) {
            System.out.println(person.getName());
        }

        //Question4
        Map<String, Long> map = people.stream().map(p -> p.getCountry()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Map---->");
        System.out.println(map);
    }


}
