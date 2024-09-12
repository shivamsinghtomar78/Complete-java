package inheritance;

public class vehicle {
    protected int numberOfTyres;

    public void setNumberOfTyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    @Override
    public String toString() {
        return "Vehicles has no. of tyres=" + numberOfTyres;

    }

    public void commute(){
        System.out.printf("I am going from place A to place B using %d tyres\n",numberOfTyres);

    }
}
