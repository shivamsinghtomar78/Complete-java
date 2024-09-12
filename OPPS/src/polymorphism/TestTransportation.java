package polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c=new Car(4);
//        Vehicle v=new Vehicle();
        Plane p =new Plane();
//        c.start();
//        p.start();
        castTest(c);
        castTest(p);

    }
    private static void castTest(Vehicle veh){
//       Car cVehicle =(Car) veh;
//       cVehicle.start();
        veh.start();
    }
}
