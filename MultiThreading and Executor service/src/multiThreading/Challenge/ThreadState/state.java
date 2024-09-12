package multiThreading.Challenge.ThreadState;

public class state extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.printf("from inside run %s ",getState());
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
