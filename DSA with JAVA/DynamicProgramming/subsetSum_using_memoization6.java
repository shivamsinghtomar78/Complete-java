package DynamicProgramming;

public class subsetSum_using_memoization6 {
    public static void main(String[] args) {
        int [] arr={8,6,2,4};
        int target=11;
        int n=arr.length;
        int[][] dp = new int[arr.length][target + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                boolean ans = false;
                boolean skip =(i>0) ? (dp[i-1][j]==1):(j==0);
                if (j - arr[i] < 0)
                    ans = skip;
                else {
                    boolean pick =  (i>0) ?(dp[i-1][j-arr[i]]==1):(j==0);
                    ans = pick || skip;
                }
                dp[i][j]=(ans) ? 1:0;

            }
        }

        System.out.println(dp[n - 1][target] == 1);

    }
}
