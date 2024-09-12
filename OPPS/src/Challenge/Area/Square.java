package Challenge.Area;
public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }
    @Override
    double calculateArea() {
        return  Math.pow(side,2);
    }




}
