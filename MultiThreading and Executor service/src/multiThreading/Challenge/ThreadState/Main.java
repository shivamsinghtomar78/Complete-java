package multiThreading.Challenge.ThreadState;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        state t1=new state();
        System.out.printf("\nCreate the thread %s \n ",t1.getState());
        t1.start();
        t1.join();
        System.out.printf("\nThread finished %s",t1.getState());

    }
}
