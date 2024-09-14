package Executor.Challenge.SingleThreadExecutorNumber_1_to_10;



import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Testing {
    public static void main(String[] args) {
       try( ExecutorService service= Executors.newSingleThreadExecutor()){
           PrintNumber num=new PrintNumber();
           service.submit(num);
       }

    }
}
