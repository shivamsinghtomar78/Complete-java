package Nested;

public class Car {
    private int noOfDoors;
    public void repair(){
        tyre t=new tyre();
    }
    protected class tyre{
        private double width;
        private double pressure;
        private String material;
        public void inflate() {
            noOfDoors=4;
        }
    }
}
