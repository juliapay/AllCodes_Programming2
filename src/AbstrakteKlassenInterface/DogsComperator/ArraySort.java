package AbstrakteKlassenInterface.DogsComperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) {
        int[] zahli = {1, 2, 77, 3};

        System.out.println(Arrays.toString(zahli));

        //HILSMETHODEN ZUM SORTIEREN
        System.out.println("-----Sortiert---------");
        Arrays.sort(zahli);
        System.out.println(Arrays.toString(zahli));


        String[] stringi = {"Hasi", "Anna", "Tom", "Steffi", "X-er"};
        System.out.println("-----String---------");
        System.out.println(Arrays.toString(stringi));
        Arrays.sort(stringi);
        System.out.println("-----String sortiert---------");
        System.out.println(Arrays.toString(stringi));
        //MIT EIGENEN OBJEKTEN?
        //nein noch nicht, da java noch nicht weiß wie wir Hunde sortieren wollen
        Dog[] dogs = {new Dog("Doggi", 2), new Dog("Snuffels", 1)};
        //--Arrays.sort(dogs);-->geht noch nicht !!! NOCH KEINE IMPLEMENTIERUNG VON COMPARETO INTERFACE

        //COMPARE TO METHODE
        String hansi = "Hansi";
        String anna = "Anna";

        //Hansi ruft mit methode von compareto auf und ist in dieser
        //aufrufen ist das THIS objekt(hansi), anna ist der erste parameter
        hansi.compareTo(anna);
        System.out.println(hansi.compareTo(anna));

        //FÜR DOG OBJEKT MIT COMPARETO INTERFACE
        Arrays.sort(dogs);
        //DOG OBJEKTE LAUT COMPARETO METHODE ABSTEIGEND SORTIERT
        System.out.println(Arrays.toString(dogs));


        //IMPORTIEREN HÄNDISCH
        //import at.AbstrakteKlassenInterface.Dogs Dog f= null;

        //----COLLECTIONS------
        List<Dog> dogsList = new ArrayList<>();
        dogsList.add(new Dog("Doggi", 17));
        dogsList.add(new Dog("Snuffels", 4));

        //SORTIEREN MIT COLLECTIONS
        Collections.sort(dogsList);
        System.out.println("---------ARRAYLIST-----------");
        System.out.println(dogsList);

        //SOERTIEREN MIT COMPAREMETHODE BEI DOG
        dogsList.add(new Dog("Fluffi", 7));

        System.out.println("--------COMPARATOR NAME AUFSTEIGEND--------");
        Collections.sort(dogsList, new DogNameComparator());
        System.out.println(dogsList);

        System.out.println("-------------COMPARATOR AGE AUFSTEIGEND-------");
        dogsList.add(new Dog("Puppy", 1));
        Collections.sort(dogsList, new DogAgeComparator());
        System.out.println(dogsList);

        //UMGEKEHRT SORTIEREN
        //REVERSE COMPARATOR
        System.out.println("-------------COMPARATOR AGE ABSTEIGEND-------");
        Collections.sort(dogsList, new DogAgeComparator().reversed());
        System.out.println(dogsList);
        //SORTIEREN ZUERST NACH ALTER UND DANN NACH NAMEN
        System.out.println("--------COMPARATOR ZUERST AGE DANN NAME----");
        dogsList.add(new Dog("Bruno", 1));
        Collections.sort(dogsList, new DogAgeNameComparator());
        System.out.println(dogsList);
    }

}

