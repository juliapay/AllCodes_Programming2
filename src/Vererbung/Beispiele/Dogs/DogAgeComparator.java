package Vererbung.Beispiele.Dogs;

import java.util.Comparator;

public class DogAgeComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
        //AUFSTEIGEND SORTIERT
    }
}
