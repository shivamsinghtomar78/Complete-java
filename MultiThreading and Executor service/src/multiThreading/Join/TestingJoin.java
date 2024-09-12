package multiThreading.Join;

import multiThreading.Runnable.PrintTask;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {
        PrintTask p1=new PrintTask('&');
        PrintTask p2=new PrintTask('p');
        PrintTask p3=new PrintTask('^');
        Thread t1=new Thread(p1);
        t1.start();
        System.out.println("\nThread 1 started");
        Thread t2=new Thread(p2);
        t2.start();
        System.out.println("\nThread 2 started");
        t1.join();
        Thread t3=new Thread(p3);
        t3.start();
        System.out.println("\nThread 3 started");
    }


}
