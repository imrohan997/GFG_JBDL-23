package com.example.operations;

/**
 * Class to demonstrate method overloading
 */
public class MethodOverloadingDemo {

    /*
       Method overloading is an OOP concept wherein functions with same name
       can be defined in one class but either number of parameters or type of parameters should be different.
     */

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sum(int num1, int num2, int num3) {
        return num1 + num2 +num3;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public float multiply(float num1, int num2) {
        return (int)(num1 * num2);
    }
}
