package com.geeksforgeeks;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

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

    }
}
