package com.eku.test;

public class DeadLock {

    private static String resourse1 = "Resourse1";
    private static String resourse2 = "Resourse2";

    public static void main(String[] args) {

        Thread thread1 = new Thread(() ->
        {
            System.out.println("Thread - " + Thread.currentThread().getName());
            synchronized (resourse1) {
                System.out.println("Thread - " + Thread.currentThread().getName() + " Locked resourse 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resourse2){
                    System.out.println("Thread - " + Thread.currentThread().getName() + "Locked resourse 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread - " + Thread.currentThread().getName());
            synchronized (resourse2){
                System.out.println("Thread - " + Thread.currentThread().getName() + " Locked resourse 2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resourse1) {
                   System.out.println("Thread - " + Thread.currentThread().getName() + " Locked resourse 1");
                }
            }
        });


        thread1.start();
        thread2.start();
    }
}
