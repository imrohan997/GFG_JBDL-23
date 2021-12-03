package com.singleton;

public class Main {

    public static void main(String[] args) {
        Person p1 = Person.getPerson();
        Person p2 = Person.getPerson();
        Person p3 = Person.getPerson();

        p1.setName("Parag Agrawal");
        System.out.println(p1.getName());

        System.out.println(p3.getName());
        System.out.println(Main2.hi()+" "+p1);
    }

}
