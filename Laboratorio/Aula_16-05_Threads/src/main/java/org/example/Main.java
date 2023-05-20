package org.example;

public class Main {
    public static void main(String[] args) {
        ThreadContador t1 = new ThreadContador("Thread 1");
        ThreadContador t2 = new ThreadContador("Thread 2");
        ThreadContador t3 = new ThreadContador("Thread 3");

        Thread tc1 = new Thread(t1);
        Thread tc2 = new Thread(t2);
        Thread tc3 = new Thread(t3);
        tc1.start();
        tc2.start();
        tc3.start();
    }
}