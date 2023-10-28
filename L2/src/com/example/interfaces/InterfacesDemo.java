package com.example.interfaces;

/**
 * This class demonstrates demo for Interfaces.
 * Keypoint of Interface-
 * 1.By default, fields of interfaces public, static, final
 * 2.By default, methods of interfaces are public and abstract.
 * 3.From JDK 8, Interfaces can have method with implementation with default keyword.
 * 4.Static method in Interfaces cannot be inherited.
 * 5.Classes implementing interfaces need to define all abstract methods of interfaces.
 */
public interface InterfacesDemo {
    int variable = 0; //member variables are public, static and final by default;
    void func1(); // methods are by default public, abstract in Java

    static void func4() {
        System.out.println("In static method of InterfacesDemo");
    }

    default void fun3() {
        System.out.println("Inside default method of InterfacesDemo");
    }
}
