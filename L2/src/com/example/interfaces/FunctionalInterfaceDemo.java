package com.example.interfaces;

/**
 * This class demonstrates Functional Interface,
 * Functional interface is an interface wherein only one abstract method is allowed.
 */
@FunctionalInterface
public interface FunctionalInterfaceDemo {

    void func1();

    static void main(String[] args) {

        //Lambda expression  for implementing Functional Interface.
        FunctionalInterfaceDemo functionalInterfaceDemo1
                = () -> System.out.println("Lambda implementation of FunctionalInterfaceDemo interface.");
        functionalInterfaceDemo1.func1();



        //Anonymous inner class implementation of Functional Interface.
        FunctionalInterfaceDemo functionalInterfaceDemo2 = new FunctionalInterfaceDemo() {
            @Override
            public void func1() {
                System.out.println("Anonymous inner class implementation of FunctionalInterfaceDemo interface.");
            }
        };
        functionalInterfaceDemo2.func1();
    }
}
