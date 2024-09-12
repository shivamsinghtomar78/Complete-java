package inheritance;

public class inheritanceTest {
    public static void main(String[] args) {
        vehicle vehicle=new vehicle();
        TwoWheeler two=new TwoWheeler();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());
        vehicle.commute();
        two.commute();
        two.balance();
        MotorCycle motor=new MotorCycle();
        motor.commute();
        motor.balance();
        motor.start();
    }
}
