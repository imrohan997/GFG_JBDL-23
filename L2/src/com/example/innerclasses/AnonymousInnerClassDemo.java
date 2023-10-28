package com.example.innerclasses;


/**
 * This class demonstrates Anonymous Inner class concept.
 */
public interface AnonymousInnerClassDemo {

    void func1();

    void func2();

    static void main(String[] args) {


        //Defined anonymous inner class by implementing abstract methods of interface without class name.
        AnonymousInnerClassDemo anonymousInnerClassDemo = new AnonymousInnerClassDemo() {
            @Override
            public void func1() {
                System.out.println("Inside func1 of AnonymousInnerClassDemo interface");
            }

            @Override
            public void func2() {
                System.out.println("Inside func2 of AnonymousInnerClassDemo interface");
            }
        };
        anonymousInnerClassDemo.func1();
        anonymousInnerClassDemo.func2();
    }
}
