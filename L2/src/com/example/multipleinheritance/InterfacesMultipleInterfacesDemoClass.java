package com.example.multipleinheritance;

/**
 * This is class demonstrating multiple inheritance concept.
 * Key pointers-
 * 1.Java supports multiple inheritance for interfaces.
 * 2.When class implements multiple interfaces and each interfaces contains same default method
 * then we need to compulsorily override that method.
 * 3.Multiple inheritance is not supported for classes.
 */
public class InterfacesMultipleInterfacesDemoClass implements InterfacesMultipleInheritanceDemo1, InterfacesMultipleInheritanceDemo2{
    @Override
    public void func1() {
        System.out.println("Inside func1 method of InterfacesMultipleInterfacesDemoClass class");
    }

    @Override
    public void func2() {
        InterfacesMultipleInheritanceDemo1.super.func2();
        func3();
    }

    public static void main(String[] args) {
        InterfacesMultipleInterfacesDemoClass interfacesDemoClass = new InterfacesMultipleInterfacesDemoClass();
        interfacesDemoClass.func1();
        interfacesDemoClass.func2();
    }
}
