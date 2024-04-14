package Vererbung.Beispiele.Animals;

public class Dog extends Animal {
    private String name;
    public Dog(String color, int countEyes, String name) {
        super(color, countEyes);
        this.name=name;
    }

    @Override
    public void walk() {
        System.out.println("The dog barks");
    }

    @Override
    public void makeNoise() {
        System.out.println("the dog runs");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
