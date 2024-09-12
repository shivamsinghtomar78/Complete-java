package sliding_Window;

import java.util.Scanner;

public class maximuSumSubArrayOfSizeK_1 {
    public static void main(String[] args) {
        int []arr={10,20,1,3,-40,80,3};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Window:");
        int k=sc.nextInt();
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <n-k+1 ; i++) {
            int sum=0;
            for (int j = i; j <k+i ; j++) {
               sum+=arr[j];
            }
            max=Math.max(max,sum);
        }
        System.out.println("Maximum sum subarray of size k is :"+max);

    }
}
