package FilterAndReduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,3,4,2,5,6,3);
        System.out.println("Normal method");
        int sum=0;
        for(int ele:numbers){
            sum+=ele;
        }
        System.out.println("Sum:"+sum);
        System.out.println("Reduce method");
      int sumR= numbers.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        });
        System.out.println(sumR);


        System.out.println("Reduce method using lambda");
        int sumL=numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println(sumL);


        System.out.println("Finding max from list using lambda and reduce ");
        int max=numbers.stream().reduce(0,(a,b)->Math.max(a,b));
        System.out.println("Maximum value :"+max);

    }
}
