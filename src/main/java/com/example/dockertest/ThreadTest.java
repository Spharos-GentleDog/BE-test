package com.example.dockertest;

public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("parent test start");
        ThreadTest1 threadTest1 = new ThreadTest1();
        ThreadTest2 threadTest2 = new ThreadTest2();
        ThreadTest3 threadTest3 = new ThreadTest3();

        threadTest1.start();
        threadTest2.start();
        threadTest3.start();

        System.out.println("parent test end");

    }

    public static class ThreadTest1 extends Thread {
        public void run() {
            System.out.println("Thread 1 start");
        }

        public void exit() {
            System.out.println("Thread 1 end");
        }
    }
    static class ThreadTest2 extends Thread {
        public void run() {
            System.out.println("Thread 2 start");
        }

        public void exit() {
            System.out.println("Thread 2 end");

        }
    }
    static class ThreadTest3 extends Thread {
        public void run() {
            System.out.println("Thread 3 start");
            System.out.println("Thread 3 end");
        }
    }
}
