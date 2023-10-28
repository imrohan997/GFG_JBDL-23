package com.example.multithreading;

/**
 *This class demonstrates Multi-threading using Runnable interface.
 * 1.Thread is the smallest execution unit of a program.
 * 2.We can spawn new Thread in a program depending upon the requirement.
 * 3.By default, Java creates "main" thread.
 */
public class MultiThreadingUsingRunnableDemo {

    public static void main(String[] args) {

        System.out.println("Current Thread : " + Thread.currentThread().getName());
        System.out.println("Total Processors : " + Runtime.getRuntime().availableProcessors());
        System.out.println("Max Memory : " + Runtime.getRuntime().maxMemory()/(1024*1024));
        System.out.println("Used Memory : " + (Runtime.getRuntime().maxMemory() - Runtime.getRuntime().freeMemory())/(1024*1024));

        Thread  thread1 = new Thread(() -> {
            System.out.println("Current Thread : " + Thread.currentThread().getName());
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            System.out.println("Current Thread : " + Thread.currentThread().getName());
        });
        thread2.start();
    }
}
