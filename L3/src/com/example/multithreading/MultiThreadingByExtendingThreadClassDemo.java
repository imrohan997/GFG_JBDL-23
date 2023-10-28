package com.example.multithreading;

/**
 * This class demonstrates Multi-threading by extending Thread class.
 * 1.Thread is the smallest execution unit of a program.
 * 2.We can spawn new Thread in a program depending upon the requirement.
 * 3.By default, Java created a thread named "main".
 */
public class MultiThreadingByExtendingThreadClassDemo {

    public static void main(String[] args) {
        System.out.println("Current Thread : " + Thread.currentThread().getName());
        System.out.println("Total Processors : " + Runtime.getRuntime().availableProcessors());
        System.out.println("Max Memory : " + Runtime.getRuntime().maxMemory()/(1024*1024));
        System.out.println("Used Memory : " + (Runtime.getRuntime().maxMemory() - Runtime.getRuntime().freeMemory())/(1024*1024));
        Mythread mythread1 = new Mythread();
        mythread1.start();

        Mythread mythread2 = new Mythread();
        mythread2.start();
    }
}

class Mythread extends Thread {
    @Override
    public void run() {
        System.out.println("Current Thread : " + Thread.currentThread().getName());
    }
}
