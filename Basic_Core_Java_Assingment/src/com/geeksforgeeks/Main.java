package com.geeksforgeeks;

import java.util.Arrays;
import java.util.Random;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        //Question 10
        Customer customer1 = new Customer(1, "Ram", "Male", 20);
        Customer customer2 = new Customer(2, "Rashmi", "Female", 40);
        Customer customer3 = new Customer(3, "Kiran", "Female", 30);
        Customer customer4 = new Customer(4, "Karan", "Male", 25);

        TreeMap<Integer, Customer> treeMap = new TreeMap<>();
        treeMap.put(customer4.getCustId(), customer4);
        treeMap.put(customer3.getCustId(), customer3);
        treeMap.put(customer2.getCustId(), customer2);
        treeMap.put(customer1.getCustId(), customer1);
        System.out.println(treeMap);

        treeMap.remove(2);
        System.out.println(treeMap);

        Customer customer = treeMap.get(3);
        if (customer == null) {
            System.out.println("No customer");
        } else {
            System.out.println(customer + " is present");
        }

        System.out.println("-----------------------------------------------------------");

        //Question 9
        Integer max = Arrays.asList(23, 21, 11, 1, 45, 90, 56, 34, 22, 33, 44, 2, 6, 3, 55).stream().max((x, y) -> x - y).get();
        System.out.println(max);
        Integer min = Arrays.asList(45, 32, 21, 45, 45, 22, 1, 4, 90, 100, 9, 89, 56).stream().min((x, y) -> x - y).get();
        System.out.println(min);

        System.out.println("-------------------------------------------------------------------");

        //Question 8
        double average = Arrays.asList(23, 21, 11, 1, 45, 90, 56, 34, 22, 33, 44, 2, 6, 3, 55).stream().mapToInt(x -> x * x).filter(x -> x > 100).average().getAsDouble();
        System.out.println(average);

        System.out.println("-----------------------------------------------------------------------");
        //Question 7

        Random random = new Random();
        random.ints(5).forEach(System.out::println);

        System.out.println("-------------------------------------------------------------------------");
        //Question 6

        //This stream code is incorrect because numbers(lets assume it to be an array of integers) is not converted to stream
        //by calling stream() method on numbers.Then further interdiate operations and end operations should be performed.
        System.out.println("-------------------------------------------------------------------------");
        //Question 5

        //Yes this piece of code is correct because from Java 8 onwards interface can have abstact methods as well as methods
        //with defination with default keyword at the start
        System.out.println("-------------------------------------------------------------------------");
        //Question 4
        //a)we cannot write filter expression after for each because forEach is terminal operation and filter is intermediate
        //operation
        //b)yes we can write filter operation after map operation because both are intermediate operations

        System.out.println("-------------------------------------------------------------------------");
        //Question 3
        //equals() and hashcode() methods belong to Object class which by default is parent class of every class and interface
        //in java.The purpose of @Override annotation is to make sure we use correct method signature as of parent class.
        //Even if we don't use @Override annotation on methods while overriding methods it can we still overrided.

        System.out.println("-------------------------------------------------------------------------");

        //Question 2
        //If we don't override equals methods in Customer class then customer instances will be compared based on their hashcode
        //and if we we have same data for all fields of customer it will be stored as two different keys in hasmap due to different hascodes.

        //Question1
        //It will start producing random hashcodes even for when two objects are same according to equals() method hence breaking
        //the contract that same objects according to equals method should have same hashcode or vice-versa.

    }
}
