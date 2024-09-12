package getterAndSetter;

public class Car {
    public String color;//public
    public String model;// public
    private double fuelLevel;
    private long costOfPurchase;//default

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public String getColor(){
        return color;
     }
     public String getModel(){
        return model;
     }
     public void setColor(String color){
        if(color.equals("yellow")){
            System.out.println("gadha hai kya???");
        }
           else  this.color=color;
     }
}
