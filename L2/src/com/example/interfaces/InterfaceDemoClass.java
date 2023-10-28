package com.example.interfaces;

/**
 * This class demonstrates implementation of InterfacesDemo
 */
public class InterfaceDemoClass implements InterfacesDemo {

    @Override
    public void func1() {
        System.out.println("Inside func1 method of InterfaceDemoClass");
    }

    public void func2() {
        System.out.println("Inside func2 method of InterfaceDemoClass");
    }

    static void func5() {
        System.out.println("Inside func4 method of InterfaceDemoClass");
    }
}
