package com.singleton;

public class Main2 {

    public static Person hi() {
        Person p1 = Person.getPerson();
        Person p2 = Person.getPerson();
        Person p3 = Person.getPerson();

        return p1;
    }
}
