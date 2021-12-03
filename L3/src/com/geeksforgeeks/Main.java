package com.geeksforgeeks;

import java.math.BigInteger;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int arr[] = {1000, 2000, 3000, 40000, 50000, 60000, 70000};

        long start = System.currentTimeMillis();
        Arrays.stream(arr).mapToObj(x -> calculateFactorial(x)).forEach(x -> System.out.println(x));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static BigInteger calculateFactorial(int num) {

        BigInteger result = BigInteger.ONE;

        for (int i = num; i >= 1; --i) {
            result = result.multiply(BigInteger.valueOf(num));
        }
        return result;

    }
}
