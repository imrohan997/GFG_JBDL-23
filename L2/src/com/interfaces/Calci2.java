package com.interfaces;

public interface Calci2 {
    int add(int a, int b);

    default int divide(int a, int b) {
        return a / b;
    }
}
