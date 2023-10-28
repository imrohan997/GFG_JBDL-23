package com.example.streams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This class demonstrates Streams in Java which got introduced from JDK 8.
 * Key pointers-
 * 1.Streams in Java works as a pipeline where elements flows one by one and desired operation is performed on it.
 */
public class StreamsDemo {

    public static void main(String[] args) {

        //Given list of Integers filter even numbers
        List<Integer> list = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 8);
        List<Integer> newList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);

        System.out.println("-----------------------");
        //Given a list of integer return sum of squares of even number
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list2.stream().filter(x -> x % 2 == 0).map(x -> x*x).reduce(0, (a, b) -> a+b));

        System.out.println("-----------------------");
        //Given a list of countries return concatenation of countries
        List<String> list3 = Arrays.asList("Delhi", "Pune", "Udaipur", "Itanagar");
        System.out.println(list3.stream().filter(x -> x.startsWith("A") || x.startsWith("E")
                || x.startsWith("I") || x.startsWith("O") || x.startsWith("U")).reduce("", (a, b) -> a + b + " "));

        System.out.println("-----------------------");
        //Given a list of countries return sorted countries based on string length
        List<String> list4 = Arrays.asList("Delhi", "Pune", "Udaipur", "Itanagar");
        System.out.println(list4.stream().sorted((x,y) -> {
            if(x.length() == y.length()) {
                return x.compareTo(y);
            }
            return x.length() - y.length();
        }).collect(Collectors.toList()));
    }
}
