package Vererbung.Beispiele.Animals;

public class Lion extends Animal {
    public Lion(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void walk() {
        System.out.println("The Lions struds");
    }

    @Override
    public void makeNoise() {
        System.out.println("The lion roars");
    }
}
