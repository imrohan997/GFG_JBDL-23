package com.singleton;

public class Person {

    private String name;
    private int age;
    private int rollno;

    private static Person person;

    private Person() {


    }

    public static Person getPerson() {
        if (person == null) {
            person = new Person();
        }
        return person;
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

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public static void setPerson(Person person) {
        Person.person = person;
    }
}
