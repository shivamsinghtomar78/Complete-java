package inheritance;

public class TwoWheeler extends vehicle {


  protected  TwoWheeler() {
        numberOfTyres=8;
    }
    public void balance(){
        System.out.println("I am balancing o two tyres!!");
    }
}
