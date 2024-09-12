package DynamicProgramming;

public class subsetSum_using_Tabulation8 {
    public static void main(String[] args) {
        int [] arr={8,6,2,4};
        int target=11;
        int[][] dp=new int[arr.length][target+1];
        for (int i = 0; i <dp.length ; i++)
            for (int j = 0; j <dp[0].length ; j++) dp[i][j]=-1;
//        System.out.println(subset(0,arr,target,dp));
    }
}
