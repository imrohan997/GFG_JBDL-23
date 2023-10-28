package com.example.finalkeyword;

/**
 * Class to demonstrate final keyword
 * 1. Final variable once initialised cannot be changed with another value;
 * 2. Final class cannot be inherited by another class.
 * 3. Final method cannot be overrided by child class but it is inherited.
 */
public final class FinalKeywordDemo {

    private final int num; // Member final variable can be initialised either during declaration or in constructor.

    public FinalKeywordDemo(int num) {
        this.num = num;
    }

    public void func() {
        int a = 4;
        final int b = 6;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        new FinalKeywordDemo(4).func();
    }
}
