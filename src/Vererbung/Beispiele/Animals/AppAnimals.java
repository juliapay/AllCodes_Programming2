package Vererbung.Beispiele.Animals;

public class AppAnimals {
    public static void main(String[] args) {
        Frog quaxi = new Frog("green", 2, "Quaxi");
        //upcasten
        Animal quaxiAsAnimals = quaxi;
        Frog q = (Frog) quaxiAsAnimals;
        Lion leo = new Lion("Yellow",2);
        Dog d = new Dog("Brown",2, "Anderle");
        Nature nature= new Nature();
        Cat c = new Cat("brown",2, "Pablo");
        nature.addAnimals(q);
        nature.addAnimals(leo);
        nature.addAnimals(d);
        nature.addAnimals(c);
        System.out.println(nature.countColor("Brown")+" Animals have the color Brown.");

    }
}
