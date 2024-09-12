package Challenge.Birds;

public  class Bird implements Flyable{

    private final String breed;

    public Bird(String breed) {
        this.breed = breed;
    }

    @Override
    public void fly() {
    }

    public String getBreed() {
        return breed;
    }
}
