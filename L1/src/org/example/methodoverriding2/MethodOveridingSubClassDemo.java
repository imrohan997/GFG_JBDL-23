package org.example.methodoverriding2;

import org.example.methodoverriding1.MethodOverridingSuperClassDemo;

/**
 * Class to demonstrate inheritance.
 * Class to demonstrate Overriding.
 * Class to demonstrate access - modifiers visibility when classes are in different packages.
 */
public class MethodOveridingSubClassDemo extends MethodOverridingSuperClassDemo {

    private String name;

    public MethodOveridingSubClassDemo() {
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fun() {
        System.out.println("Fun function in Company");
    }

    public static void main(String[] args) {
        MethodOveridingSubClassDemo methodOveridingSubClassDemo = new MethodOveridingSubClassDemo();
        methodOveridingSubClassDemo.setName("Media.net");
        methodOveridingSubClassDemo.fun();
        methodOveridingSubClassDemo.name = "Directi"; // variable with private access-modifier is accessible in same class.
        methodOveridingSubClassDemo.address = "Bengaluru"; // variable with public access-modifier is accessible anywhere.In this case it can be accessible in inherited class in another package
        methodOveridingSubClassDemo.domain = "Software Product Development"; // variable with protected access-modifier is accessible in inherited class of different package.
    }
}