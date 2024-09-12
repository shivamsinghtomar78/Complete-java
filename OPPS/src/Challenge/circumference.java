package Challenge;

import java.util.Scanner;

public class circumference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius of circle : ");
        int r=sc.nextInt();
        double circumference=  (2*Math.PI*r);
        System.out.println("Circumference of circle : "+circumference);

    }
}
