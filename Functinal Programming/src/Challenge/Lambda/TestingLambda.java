package Challenge.Lambda;

import java.util.function.BinaryOperator;

public class TestingLambda {
    public static void main(String[] args) {
        BinaryOperator<Integer> multi=(a,b)->a*b;
        int result=multi.apply(4,5);
        System.out.println(multi);
    }
}
