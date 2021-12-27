package com.interfaces;

public interface Calci {

    int add(int a, int b);

    int subtract(int a, int b);

    int mutiply(int a, int b);

    default int divide(int a, int b) {
        return a / b;
    }
}
