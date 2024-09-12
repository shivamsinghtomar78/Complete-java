package varargs;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(4,8));
        System.out.println(sum(4,5,6));
        System.out.println(sum(4,5,6,5,9,8,7));
    }
    public static int sum(int first,int second,int ...a){
        int sum=first+second;
        for (int i : a) {
            sum+=i;

        }
        return sum;
    }

}
