package com.example.multipleinheritance;

/**
 * This interface is used to demonstrate multiple inheritance concept.
 */
public interface InterfacesMultipleInheritanceDemo1 {

    void func1();

     default void func2() {
        System.out.println("Inside func2 method of InterfacesMultipleInheritanceDemo1");
    }
}
