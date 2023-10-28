package com.example.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * This class demonstrates Java Generics.
 * Key pointers-
 * 1.'<R>' infront of class name with generic variable 'R' makes class Generic.
 * 2. Generic variable can be made more restrictive by using following syntax <R extends List>
 */
public class GenericsDemo<R> {

    public void func1(R arg) {
        System.out.println("Inside func1 method of GenericsDemo class : " + arg);
    }

    public static void main(String[] args) {
        GenericsDemo<List> genericsDemo =  new GenericsDemo<List>();
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        genericsDemo.func1(list);
    }
}
