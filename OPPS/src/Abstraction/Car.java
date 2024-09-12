package Abstraction;

public class Car extends Vehicle{
    private int noOfDoor;
    public Car() {
        super(4);
    }

    @Override
    public void makeStartSound() {
        System.out.println("Vromm......");
    }
}
