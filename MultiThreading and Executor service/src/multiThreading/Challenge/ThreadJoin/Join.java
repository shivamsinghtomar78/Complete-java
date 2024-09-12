package multiThreading.Challenge.ThreadJoin;

public class Join extends Thread {
    private final int threadNumber;

    public Join(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {

        System.out.printf("%s Thread starting -%d\n",Thread.currentThread().getName(),threadNumber);
       try {
           Thread.sleep(5000);
       }catch (InterruptedException e)
       {
          throw new RuntimeException();
       }
        System.out.printf("%s Thread Ended-%d\n",Thread.currentThread().getName(),threadNumber);

    }
}
