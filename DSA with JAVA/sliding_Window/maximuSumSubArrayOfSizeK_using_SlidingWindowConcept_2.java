package sliding_Window;

import java.util.Scanner;

public class maximuSumSubArrayOfSizeK_using_SlidingWindowConcept_2 {
    public static void main(String[] args) {
        int []arr={10,20,1,3,-40,80,3};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Window:");
        int k=sc.nextInt();
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=k-1;
        int sum=0;
        for (int l = 0; l <k ; l++) {
            sum+=arr[l];
        }
        i++; j++;
        while(j<n){
            sum=sum-arr[i-1]+arr[j];
            max=Math.max(max,sum);
            i++;
            j++;
        }
        System.out.println("Maximum sum subarray of size k is :"+max);
    }
}
