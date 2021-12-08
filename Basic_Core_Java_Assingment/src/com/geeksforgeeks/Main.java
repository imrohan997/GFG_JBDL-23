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

    }
}
