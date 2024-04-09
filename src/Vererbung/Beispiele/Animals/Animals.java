package Vererbung.Beispiele.Animals;

public abstract class Animals {
     String color;
     int countEyes;

    public Animals(String color, int countEyes) {
        this.color = color;
        this.countEyes = countEyes;
    }
    public abstract void  walk();
    public  abstract void makeNoise();

}
