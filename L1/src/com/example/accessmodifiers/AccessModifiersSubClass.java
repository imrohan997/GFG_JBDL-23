package com.example.accessmodifiers;


/**
 * Class to demonstrate access modifiers visibility
 */
public class AccessModifiersSubClass extends AccessModifiersClass {
    private String salary;

    public void func() {
        this.age = 25; // variable with default access modifier is visible in inherited class within same package
        this.height = 185; // variable with protected access modifier is visible in inherited class within same package
        this.address = "Delhi"; // variable with public access modifier is visible in inherited class within same package
        this.salary = "150000"; // variable with private access modifier is visible in same class in which it is defined
    }
}
