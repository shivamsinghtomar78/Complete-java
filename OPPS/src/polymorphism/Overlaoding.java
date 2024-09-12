package polymorphism;

public class Overlaoding {
    Overlaoding() {
        System.out.println("Default constructor");
    }
    Overlaoding(String pop){
        System.out.println(pop);
    }

    public int add(int a, int b){
        return a+b;
    }
    public String add(String a,String b){
        return a.concat(b);
    }
    public int add(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        Overlaoding overload=new Overlaoding();
        System.out.println(overload.add("Shivam ","Singh"));
        System.out.println(overload.add(4,5,1,10));
        System.out.println(overload.add(4,11));
    }
}
