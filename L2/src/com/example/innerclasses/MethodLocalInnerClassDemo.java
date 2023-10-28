package com.example.innerclasses;

/**
 *This class demonstrated Method Local Inner Classe
 * Key pointers-
 * 1. Method Local Inner class is defined in method of a class.
 * 2. Method Local Inner class cannot be private,protected or public.It can be only default.
 * 3. Method Local Inner class can access local variable od method.
 */
public class MethodLocalInnerClassDemo {

    public void func1() {

        System.out.println("Inside outer method of class MethodLocalInnerClassDemo");
        int x = 3;

        class InnerClass {
            public void show() {
                System.out.println("Inside InnerClass method of : " + x);
            }
        }

        new InnerClass().show();
    }

    public static void main(String[] args) {
        MethodLocalInnerClassDemo methodLocalInnerClassDemo = new MethodLocalInnerClassDemo();
        methodLocalInnerClassDemo.func1();
    }
}
