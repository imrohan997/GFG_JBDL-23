package com.interfaces;

public class Calc implements Calci,Calci2 {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }


    @Override
    public int mutiply(int a, int b) {
        return a + b;
    }

    @Override
    public int divide(int a, int b) {
        return Calci2.super.divide(a, b);
    }

}
