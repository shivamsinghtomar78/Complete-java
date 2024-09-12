package Enums;

public class TestingEnums {
    public static void main(String[] args) {
        TrafficLight color=TrafficLight.Red;
        color=TrafficLight.Yellow;
        Grade grade=Grade.valueOf("D");
        for(Grade value:Grade.values()){
            System.out.println(value);
        }

    }
}
