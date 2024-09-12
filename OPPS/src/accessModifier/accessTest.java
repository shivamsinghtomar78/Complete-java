package accessModifier;

public class accessTest {
    public static void main(String[] args) {
        Car car=new Car();
        car.color="Red";
        car.model="Swift";
        System.out.println(car);
        Car newCar=new Car("Black","BMW",1,50000);
        System.out.println(newCar);
    }
}
