package com.example.singleton;

/**
 * This class demonstrates Singleton Design Pattern
 * In singleton design pattern, only one instance is formed for a class
 */
public class SingletonDesignDemo {

    private static SingletonDesignDemo object;

    //Making constructor private so that it cannot be accessed from outside of this class.
    private SingletonDesignDemo() {
        System.out.println("In com.example.singleton.SingletonDesignDemo constructor");
    }

    public static SingletonDesignDemo getObject() {
        if(object == null) {
            object = new SingletonDesignDemo();
        }
        return object;
    }
}
