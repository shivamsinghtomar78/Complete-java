package Driving;

public class driver {
    static int minAgeForDriving=18;
    String name;
    int age;
    String dateOfLicense;
    public static void main(String[] args) {
//        Car myCar=new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(6);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());
        Car Swift=new Car();
        Car Thar =new Car("Black");
        Swift.addFuel(6);
         Swift.start().drive();
        System.out.println(Swift.color);
        System.out.println(Thar.color);
        System.out.println(Thar.currentFuelInLitre);




    }


}
