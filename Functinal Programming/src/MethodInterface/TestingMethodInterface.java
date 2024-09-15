package MethodInterface;

import java.util.ArrayList;
import java.util.List;

public class TestingMethodInterface {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,3,4,2,5,6,3);
        numbers.stream().filter(num->num%2!=0).forEach(num-> System.out.println(num));

        System.out.println();
        numbers.stream().filter(num->num%2!=0).forEach(System.out::println);
    }
}
