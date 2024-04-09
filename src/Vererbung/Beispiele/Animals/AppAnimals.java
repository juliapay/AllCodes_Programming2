package Vererbung.Beispiele.Animals;

public class AppAnimals {
    public static void main(String[] args) {
        Frog quaxi = new Frog("green", 2, "Quaxi");
        Animals quaxiAsAnimals = quaxi;
        Frog q = (Frog) quaxiAsAnimals;
    }
}
