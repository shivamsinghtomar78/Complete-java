package DynamicProgramming;

import java.util.Scanner;

public class friendsPairingProblem_using_Tabulation2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of friends: ");
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<n+1;i++){
            dp[i]=dp[i-1]+(i-1)*dp[i-2];
        }
        System.out.println(dp[n]);
    }
}
