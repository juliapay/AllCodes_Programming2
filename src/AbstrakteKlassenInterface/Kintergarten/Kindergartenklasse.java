package AbstrakteKlassenInterface.Kintergarten;

import A_aCheatSheet.Comparator_CheatSheet;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kindergartenklasse {
    private String klasse;
    private List<Kind> kinder;

    public Kindergartenklasse(String klasse) {
        this.klasse = klasse;
        this.kinder = new ArrayList<>();
    }
    public void addKind(Kind kind){
        if(!kinder.contains(kind)){
            kinder.add(kind);
        }
    }

    public void sortAlphabetical(){
        AlphabeticalComparator alphabeticalComparator= new AlphabeticalComparator();
        Collections.sort(kinder, alphabeticalComparator);
        System.out.println("kinder sortiert nach Nachnamen und Vornamen");
        for(Kind g:kinder){
            System.out.println(g);
        }

    }
    public void sortAge(){
        AgeComparator ageComparator= new AgeComparator();
        Collections.sort(kinder, ageComparator);
        System.out.println("kinder sortiert nach Alter");
        for(Kind g:kinder){
            System.out.println(g);
        }

    }

    public String getKlasse() {
        return klasse;
    }

    public List<Kind> getKinder() {
        return kinder;
    }

    @Override
    public String toString() {
        return "Kindergartenklasse{" +
                "klasse='" + klasse + '\'' +
                ", kinder=" + kinder;
    }
}
