package AbstrakteKlassenInterface.Getraenke;

import java.util.*;

public class Registrierkasse {
    private List<Getraenk> registrierkasse;
    private static int verkaufteGetraenke;


    public Registrierkasse() {
        this.registrierkasse= new ArrayList<>();

    }

    public  int getVerkaufteGetraenke() {
        return verkaufteGetraenke;
    }


    public void verkauft(Getraenk g){
        if (registrierkasse!=null) {
            registrierkasse.add(g);
            verkaufteGetraenke++;
        }
    }


    public void printGetraenkeSortiertNachAnzahlZutaten(){
        AnzahlZutatenComparator getraenkeComperator1 =new AnzahlZutatenComparator();
        Collections.sort(registrierkasse,getraenkeComperator1);
        System.out.println("Getränke sortiert nach Anzahl der Zutaten");
        for(Getraenk g:registrierkasse){
            System.out.println(g);
        }
    }
    public void printGetraenkeSortiertNachMl(){
        MlComperator getraenkeComperator2 = new MlComperator();
        Collections.sort(registrierkasse,getraenkeComperator2);
        System.out.println("Getränke sortiert nach Menge");
        for(Getraenk g:registrierkasse){
            System.out.println(g);
        }
    }
    public HashMap<Integer, ArrayList<Getraenk>> getGetraenkeAufgeteiltNachZutaten(){
        HashMap<Integer, ArrayList<Getraenk>> createdHashMap = new HashMap<>();
        ArrayList<Getraenk> drinkArrayList1 = new ArrayList<>();
        ArrayList<Getraenk> drinkArrayList2 = new ArrayList<>();
        ArrayList<Getraenk> drinkArrayList3 = new ArrayList<>();
        Getraenk temp;

        for (Getraenk g : registrierkasse) {
            temp = g;
            if (g.getAnzahlzutaten() == 1) {
                drinkArrayList1.add(temp);
                createdHashMap.put(1, drinkArrayList1);
            } else if (g.getAnzahlzutaten() == 2)  {
                drinkArrayList2.add(temp);
                createdHashMap.put(2, drinkArrayList2);
            } else if (g.getAnzahlzutaten() > 2) {
                drinkArrayList3.add(temp);
                createdHashMap.put(3, drinkArrayList3);
            }
        }
        return createdHashMap;
    }

    public void printCreatedHashMap() {
        HashMap<Integer, ArrayList<Getraenk>> printThis = getGetraenkeAufgeteiltNachZutaten();
        for (Map.Entry<Integer, ArrayList<Getraenk>> entry : printThis.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


}
