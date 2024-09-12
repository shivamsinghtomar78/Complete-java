package Challenge;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Guess number betweeen 1 to 10:");
        int n=sc.nextInt();
        while(true){
             double Random=Math.random();
             int guessNumber=(int)(Random*100);
             if(guessNumber<=10 && guessNumber>=1){

                 if(guessNumber==n){
                     System.out.println("You guess right number,and you are winner!!");
                 }
                 else {
                     System.out.println("You guess wrong number ,and you are losser!!");
                     System.out.println("Right number is "+guessNumber);
                 }

                 break;

             }
        }
    }
}
