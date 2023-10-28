package com.example.statickeyword;

/**
 * Class to demonstrate static keyword
 * 1. Variable with static keyword belong to class and not object i.e it is initialized during
 * class loading itself and is shared among all the instances of a class.
 * 2. Static method belongs to class itself and is shared by class objects.
 * 3. Static block is used to write logic related to static variable which needs to be executed during class loading.
 * 4. Static Nested class are classes which is nested in a class and can access only static variable of outer class.
 */
public class StaticKeywordDemo {

    private String variable;
    public static int count; //Static variable of this class

    public StaticKeywordDemo() {
        System.out.println("In Static Class Constructor");
        this.variable = "";
        count++;
    }

    //Static block
    static {
        System.out.println("Inside static block");
    }

    /**
     * Static method of this class
     * @return
     */
    public static int count() {
        return count;
    }


    /**
     * Static inner class
     */
    static class InnerStaticClass {
        public int innerVariable = count;
    }

    public static void main(String[] args) {
        StaticKeywordDemo staticKeywordDemo = new StaticKeywordDemo();
        StaticKeywordDemo staticKeywordDemo1 = new StaticKeywordDemo();
        StaticKeywordDemo staticKeywordDemo2 = new StaticKeywordDemo();
        System.out.println( new InnerStaticClass().innerVariable); //It will print 3 since count is created only once at class level and shared among all objects.
    }
}
