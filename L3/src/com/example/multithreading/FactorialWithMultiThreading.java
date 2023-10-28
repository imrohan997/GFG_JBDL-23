package com.example.multithreading;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;

public class FactorialWithMultiThreading {
    public static void main(String[] args) {

        System.out.println("Current thread : " + Thread.currentThread().getName());

        int arr[] = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000};

        FactorialThread[] factorialThread = new FactorialThread[arr.length];

        //Making Pair of factorialThread and numbers
//        List<Pair> pairs = new ArrayList<>();
//        for(int i = 0; i < arr.length; ++i) {
//            factorialThread[i] = new FactorialThread(arr[i]);
//            Pair pair = new Pair(factorialThread[i], arr[i]);
//            pairs.add(pair);
//        }

        long startTime = System.currentTimeMillis();

        IntStream.range(0, arr.length).forEach(i -> {
            factorialThread[i] = new FactorialThread(arr[i]);
            factorialThread[i].start();
        });

        //This code blocks current Thread to execute further until the thread on which join() is called completes its execution.
        Arrays.stream(factorialThread) .forEach(thread ->
        {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        Arrays.stream(factorialThread).forEach(thread ->
                System.out.println("Factorial of " + thread.getNum() + " is : " + thread.getResult())
        );

        System.out.println("Total time : " + (System.currentTimeMillis() - startTime));
    }

    private static class Pair {
        private FactorialThread factorialThread;
        private int num;

        public Pair(FactorialThread factorialThread, int num) {
            this.factorialThread = factorialThread;
            this.num = num;
        }

        public void setFactorialThread(FactorialThread factorialThread) {
            this.factorialThread = factorialThread;
        }

        public FactorialThread getFactorialThread() {
            return factorialThread;
        }

        public int getNum() {
            return num;
        }
    }
}

class FactorialThread extends Thread {

    private int num;
    private BigInteger result;

    public FactorialThread(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public BigInteger getResult() {
        return result;
    }

    @Override
    public void run() {
        BigInteger fact =  BigInteger.ONE;
        System.out.println("Current thread : " + Thread.currentThread().getName());
        for (int i = 1 ;i <= num; ++i) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        result = fact;
    }
}
