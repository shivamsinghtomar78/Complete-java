package Executor.Future;

import java.util.concurrent.Callable;

public class FetchName implements Callable<String> {

    private final String name;

    public FetchName(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.printf("\n Getting full name of %s",name);
        Thread.sleep(4000);
        return name+" Bharatiya";
    }
}
