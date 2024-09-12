package DynamicProgramming;

public class subsetSum5 {
    public static void main(String[] args) {
        int [] arr={8,6,2,4};
        int target=11;
        System.out.println(subset(0,0,arr,target));
    }

    private static boolean subset(int i, int sum, int[] arr, int target) {
        if(i==arr.length){
            if(sum==target) return true;
            else return false;
        }
        boolean skip=subset(i+1,sum,arr,target);
        if(sum+arr[i]>target) return skip;
        boolean pick=subset(i+1,sum+arr[i],arr,target);
        return skip || pick;
    }


}
