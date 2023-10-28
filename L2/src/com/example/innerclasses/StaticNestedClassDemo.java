package com.example.innerclasses;

/**
 * This class demonstrates static inner class.
 * 1.Inner class with static keyword is called Static inner class.
 * 2.Static inner class is a static member of a class and it is not strongly associated with object of outer class.
 * 3.Object of static inner class can be created without creating object of outer class.
 * 4.Static inner class can access any static member of outer class but not instance member of outer class.
 * 5.Outer class cannot access any variables or methods of inner class.
 */
public class StaticNestedClassDemo {

    private int x = 4;
    static int y_static_outer = 5;
    private static int z_static_outer_private = 6;

    static class InnerClass {

        public void display() {
            System.out.println("Static outer : " + y_static_outer);

            System.out.println("Static outer private : " + z_static_outer_private);

            StaticNestedClassDemo staticNestedClassDemo = new StaticNestedClassDemo();
            System.out.println("Outer Instance variable : " + staticNestedClassDemo.x);
        }
    }

    public static void main(String[] args) {
        StaticNestedClassDemo.InnerClass innerClass = new StaticNestedClassDemo.InnerClass();
        innerClass.display();
    }
}
