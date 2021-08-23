package com.elite.kvijay9;

import java.util.List;
import java.util.UUID;

public class DedlockExample {

    public static void main(String[] args) throws Exception{

        List l = List.of(1, 2, 3, 4, 5);

        System.out.println(l.contains(2));

        /*Object resource1 = new Object();
        Object resource2 = new Object();

        Runnable job1 = () -> {
            synchronized (resource1){
                sleep(100);
                synchronized (resource2){
                    System.out.println("unreachable...");
                }
            }
        };

        Runnable job2 = () -> {
            synchronized (resource2){
                sleep(100);
                synchronized (resource1){
                    System.out.println("unreachable...");
                }
            }
        };

        new Thread(job1, "worker1").start();
        new Thread(job2, "worker2").start();*/


    }

    static void sleep(long milliSec){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
