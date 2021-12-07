package com.geeksforgeeks;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FactorialByMultiThreading {
    public static void main(String[] args) {

        int arr[] = {1000, 2000, 3000, 40000, 50000, 60000, 70000};
        FactorialThread[] factorialThreads = new FactorialThread[arr.length];

        long start = System.currentTimeMillis();
        IntStream.range(0, arr.length).forEach(i -> {
            factorialThreads[i] = new FactorialThread(arr[i]);
            factorialThreads[i].start();
        });

        Arrays.stream(factorialThreads).forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Arrays.stream(factorialThreads).forEach(thread -> {
            System.out.println("Result=" + thread.result);
        });

        long end = System.currentTimeMillis();
        System.out.println("Time=" + (end - start));


    }

    private static class FactorialThread extends Thread {

        private int num;
        private BigInteger result;

        public FactorialThread(int num) {

            this.num = num;
            this.result = BigInteger.ONE;
        }

        public void run() {
            factorial(num);
        }

        public void factorial(int num) {
            System.out.println("Thread=" + currentThread().getName() + ",num=" + num);
            for (int i = num; i >= 1; --i) {
                result = result.multiply(BigInteger.valueOf(i));
            }
        }
    }
}
