package com.example.multithreading;

import java.math.BigInteger;
import java.util.Arrays;

public class FactorialWithoutMultiThreading {
    public static void main(String[] args) {

        int arr[] = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000};

        long startTime =  System.currentTimeMillis();
        Arrays.stream(arr).forEach(num -> {
            System.out.println(getFactorial(num));
        });


        System.out.println("Total Time : " + (System.currentTimeMillis() - startTime));
    }

    public static BigInteger getFactorial(int num) {

        BigInteger fact =  BigInteger.ONE;
        System.out.println("Current thread : " + Thread.currentThread().getName());
        for (int i = 2 ;i < num; ++i) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
