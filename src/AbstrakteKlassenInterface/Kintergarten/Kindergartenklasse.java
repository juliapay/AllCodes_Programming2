package AbstrakteKlassenInterface.Kintergarten;

import A_aCheatSheet.Comparator_CheatSheet;


import java.util.*;

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
    public HashMap<Integer,List<Kind>> sortiertKinderNachAlterInListen(){
        HashMap<Integer,List<Kind>>  sortierNachAlterInListen=new HashMap<>();

        if(kinder!=null){
            for (Kind k:kinder) {
                if(sortierNachAlterInListen.containsKey(k.getAge())){
                    List<Kind>gesamt= sortierNachAlterInListen.get(k.getAge());
                   gesamt.add(k);
                }else{
                    ArrayList<Kind>gesamt= new ArrayList<>();
                    gesamt.add(k);
                    sortierNachAlterInListen.put(k.getAge(),gesamt);
                }
            }
        }

Set<Integer> keyset=sortierNachAlterInListen.keySet();
        for (Integer s:keyset) {
            System.out.println("Kinder mit "+s+" Jahre: "+sortierNachAlterInListen.get(s));
        }
        return sortierNachAlterInListen;
    }

    public String getKlasse() {
        return klasse;
    }

    public List<Kind> getKinder() {
        return kinder;
    }


}