package com.example.abstracts;

/**
 * This class demonstrates demo for abstract class concept.
 * Keypoint about abstract class
 * 1.Abstract classes cannot be instantiated.It needs to be inherited by subclass.
 * 2.If any method is abstract in abstract class then we need to make class abstract as well but vice-versa is not true.
 * 3.Any subclass inheriting abstract class need to define all the abstract method of abstract class otherwise subclass also needs to be abstract
 * 4.Abstract class have constructors, but it is only evoked when object of concrete subclass is made.
 * 5.Abstract class can have static method, but it cannot be override in subclass but can be inherited
 * 6.Abstract class can have final methods but abstract methods cannot be declared final.Final methods cannot be override in child class.
 */
public abstract class AbstractClassDemo {

    public AbstractClassDemo() {
        System.out.println("Inside constructor of AbstractClassDemo");
    }

    public void func1() {
        System.out.println("Inside func1 of AbstractClassDemo");
    }

    protected abstract void func2();

    public static void func3() {
        System.out.println("Inside static method func3 of AbstractClassDemo");
    }

    public final void func4() {
        System.out.println("Inside final func4 method of AbstractClassDemo");
    }
}
