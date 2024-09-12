package polymorphism;

public class Car extends Vehicle  {
    public int noOfDoors(){
        return 5;
    }
    Car(int noOftyres){
       super(noOftyres);
    }

    @Override
    public void start() {
        System.out.println(super.getNoOfTyres());
        System.out.println("Car is starting !!");
    }
}
