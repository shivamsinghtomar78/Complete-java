package Challenge;

public class ConcatenateStrings_Using_Varags {
    public static void main(String[] args) {
        System.out.println(concat("Shivam ","Singh ","Tomar ","New Delhi ","Baljeet Naagr"));
    }
    public static String concat(String a,String ...b){
        String con=a;
        for(String ele:b){
            con+=ele;
        }
        return con;
    }
}
