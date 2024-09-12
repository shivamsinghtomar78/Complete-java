package Driving;

import java.sql.SQLOutput;

public class Car {
    static int noOfCarsSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLitre;
    int noOfSeats;

    static {
        noOfCarsSold=0;
        System.out.println("This is a static Block!!");
    }
    {
        noOfCarsSold++;//
        System.out.println("This is a init Block!!");
    }
    public Car(String color){
        this.color=color;
        noOfWheels=4;
        maxSpeed=150;
        currentFuelInLitre=2;
        noOfSeats=5;
    }
    Car(){
        this("Red");
        currentFuelInLitre=5;
    }
    public Car start(){
        if(currentFuelInLitre<=0) {
            System.out.println("Car is out of fuel.can not start");
        }
        else if(currentFuelInLitre<5){
            System.out.println("Car is in reserved mode ,please refuel");

        }
        else {
            System.out.println("Car is started!!");

        }
        return this;
    }
    public void drive(){
         currentFuelInLitre--;
        System.out.println("Car is driving");
    }
    public void addFuel(float currentFuelInLitre){
        this.currentFuelInLitre+=currentFuelInLitre;
    }
    public float getCurrentFuelLevel(){
        return currentFuelInLitre;
    }

}
