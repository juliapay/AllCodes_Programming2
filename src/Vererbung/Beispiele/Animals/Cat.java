package Vererbung.Beispiele.Animals;

public class Cat extends Animal {
    private String name;
    public Cat(String color, int countEyes, String name) {
        super(color, countEyes);
        this.name=name;
    }

    @Override
    public void makeNoise() {
        System.out.println("THe cat purrs");
    }

    @Override
    public void walk() {
        System.out.println("The cat sneaks");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
