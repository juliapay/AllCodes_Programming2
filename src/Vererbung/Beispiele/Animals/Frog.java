package Vererbung.Beispiele.Animals;

public class Frog extends Animals {


    public Frog(String color, int countEyes, String name) {
        super(color, countEyes);

    }

    @Override
    public void walk() {
        System.out.println("The frog jumps");
    }

    @Override
    public void makeNoise() {
        System.out.println("The Frog croaks");
    }
}
