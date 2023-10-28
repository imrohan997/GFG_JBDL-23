package com.example.generics;

@FunctionalInterface
public interface GenericInterfaceDemo<T, R> {

    R func1(T arg) ;

    static void main(String[] args) {

        GenericInterfaceDemo<String, Void> genericInterfaceDemo = (arg1) -> {
            System.out.println("String1 : " + arg1);
            return null;
        };

        genericInterfaceDemo.func1("Demo String");
    }
}
