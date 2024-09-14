package Executor.Challenge.SingleThreadExecutorNumber_1_to_10;

public class PrintNumber implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("Number is :"+i);

        }
    }
}
