package com.geeksforgeeks;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        double avgAge = people.stream().mapToInt(p -> p.getAge()).average().getAsDouble();
        System.out.println("Average Age:" + avgAge);

        System.out.println("------------------------------------------------------------------------");

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

        System.out.println("Person 20+age or vowels in their names");
        for (Person person : res) {
            System.out.println(person.getName());
        }

        System.out.println("------------------------------------------------------------------------");


        //Question3
        List<Person> sortedList = people.stream().sorted((p1, p2) -> {
            if (p1.getAge() == p2.getAge()) {
                return p2.getName().compareTo(p1.getName());
            }
            return p1.getAge() - p2.getAge();
        }).collect(Collectors.toList());

        System.out.println("Sorted list");
        for (Person person : sortedList) {
            System.out.println(person.getName());
        }

        System.out.println("------------------------------------------------------------------------");

        //Question4
        Map<String, Long> map = people.stream().collect(Collectors.groupingBy(p -> p.getCountry(), Collectors.counting()));

        System.out.println("Map with country Vs Citizens");
        System.out.println(map);

        System.out.println("------------------------------------------------------------------------");

        //Question5
        Map<String, Double> map2 = people.stream().collect(Collectors.groupingBy(p -> p.getCountry(), Collectors.averagingDouble(p -> p.getAge())));

        System.out.println("Map with Country Vs Average Age");
        System.out.println(map2);

        System.out.println("------------------------------------------------------------------------");

        //Question6
        Map<Object, Optional<Person>> map3 = people.stream().collect(Collectors.groupingBy(p -> p.getCountry(), Collectors.maxBy((a, b) -> a.getAge() - b.getAge())));
        System.out.println(map3);

        System.out.println("------------------------------------------------------------------------");

        //Question7
        Map<Object, Long> map4 = people.stream().collect(Collectors.groupingBy(p -> p.getCountry(), Collectors.counting()));


        System.out.println("------------------------------------------------------------------------");

        //Question 8
        Stream.generate(() -> new Random().nextInt()).limit(20).forEach((x) -> System.out.println(x));


    }


}
