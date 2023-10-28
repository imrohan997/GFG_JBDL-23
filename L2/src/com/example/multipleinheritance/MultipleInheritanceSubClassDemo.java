package com.example.multipleinheritance;

/**
 * This class is used to demonstrate multiple inheritance by extending and implementing both class and interfaces simultaneously.
 * Key points-
 * 1.When class implements and extends both class and interface and super class and
 * interface have common method name then method in class gets precedence for inheritance.
 *
 */
public class MultipleInheritanceSubClassDemo extends MultipleInheritanceDemoClass implements InterfacesMultipleInheritanceDemo1 {

    public static void main(String[] args) {
        new MultipleInheritanceSubClassDemo().func1();
        new MultipleInheritanceSubClassDemo().func2();
    }

}
