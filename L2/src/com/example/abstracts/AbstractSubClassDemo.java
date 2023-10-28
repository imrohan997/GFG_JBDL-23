package com.example.abstracts;

/**
 * This class inherits AbstractClassDemo(abstract class)
 */
public class AbstractSubClassDemo extends AbstractClassDemo {

    public AbstractSubClassDemo() {
        System.out.println("Inside constructor of AbstractSubClassDemo");
    }

    @Override
    public void func2() {
        System.out.println("Inside func2 of AbstractSubClassDemo");
    }
}
