package Vererbung.Beispiele.Animals;

import java.util.ArrayList;
import java.util.List;

public class Nature {

    private List<Animal> animals;

    public Nature() {
        animals = new ArrayList<>();
    }

    public void addAnimals(Animal a) {

        if (!animals.contains(a)) {
            animals.add(a);
        }
    }

    public int countColor(String color) {
        int sumColorBrown = 0;
        for (Animal a : animals) {
            if (a.getColor().equalsIgnoreCase(color)) {
                sumColorBrown++;
            }
        }
        return sumColorBrown;
    }
}
