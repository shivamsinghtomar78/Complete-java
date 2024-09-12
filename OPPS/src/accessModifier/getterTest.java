package accessModifier;

import getterAndSetter.Car;

public class getterTest {
    public static void main(String[] args) {
        Car car=new Car("Black","Maruti",3,8000);
        System.out.println( car.getColor()+" "+car.getModel());
        car.setColor("Red");
        System.out.println( car.getColor()+" "+car.getModel());
        car.setColor("yellow");





    }
}
