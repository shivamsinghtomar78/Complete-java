package Exception;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Division Calculator");
        System.out.print("Please Enter your first number:");
        int first=sc.nextInt();
        System.out.print("Please Enter your second number:");
        int second=sc.nextInt();
        try {
            int []a=new int[5];
//            System.out.printf("Result is %d",a[4]);
            a[6]=first/second;
            int result = first / second;
            System.out.printf("Result is %d ", result);
        }
        catch (ArithmeticException exception){
            System.out.printf("%s ,enter valid values",exception.getMessage());
        }
        catch (Throwable th){
            System.out.println(" General Exception");
        } finally {
            System.out.println("Finall");
        }

    }
}
