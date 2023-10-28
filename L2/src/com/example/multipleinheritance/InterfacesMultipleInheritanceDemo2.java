package com.example.multipleinheritance;

/**
 * This interface is used to demonstrate multiple inheritance concept.
 */
public interface InterfacesMultipleInheritanceDemo2 {

    void func1();

    default void func2() {
        System.out.println("Inside func2 method of InterfacesMultipleInheritanceDemo2");
    }

    default void func3() {
        System.out.println("Inside func3 method of InterfacesMultipleInheritanceDemo2");
    }

}
