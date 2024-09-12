package Challenge.Calculator_Override;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculate =new Calculator();
        System.out.println("Add two integer number :"+calculate.add(8,9));
        System.out.println("Add two double number :"+calculate.add(8.5,9.2));
        System.out.println("Add three integer number :"+calculate.add(8,9,10));
    }
}
