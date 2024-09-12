package Challenge.Area;

public class ShapeTester {
    public static void main(String[] args) {
        Square s1=new Square(4.9);
        Circle c1=new Circle(7);
        System.out.println(c1.calculateArea());
        System.out.println(s1.calculateArea());
    }
}
