package AbstrakteKlassenInterface.Enten;

import AbstrakteKlassenInterface.Figures.Figure;

import java.util.*;

public class Entenhausen {
    private List<Ente> enten;
    //Constructor zur Initialisierung der Arrayliste;
    public Entenhausen() {
        this.enten = new ArrayList<>();
    }

    public void addEnte(Ente e) {
        //um Exceptions auszuschließen
        if (enten != null) {
            //damit nicht 2x befüllt wird
            if (!enten.contains(e)) {
                enten.add(e);
            }
        }
    }

    public Map<Integer, List<Ente>> getGruppierteEnten() {
        //deklarien-Initilsieren Hashmap
        HashMap<Integer, List<Ente>> entenListe = new HashMap<>();
        //deklarien-Initilsieren Listen für die hashmap
        List<Ente> tiny = new ArrayList<>();
        List<Ente> medium = new ArrayList<>();
        List<Ente> schwereKnochen = new ArrayList<>();
        //initialisierung der Map mit dem gewicht als key und der leeren Liste als value
        entenListe.put(100, tiny);
        entenListe.put(200, medium);
        entenListe.put(300, schwereKnochen);
        //iteration durch die Arrayliste der enten
        for (Ente e : enten) {
            if (e.getFullWeight() <= 100) {
                tiny.add(e);
            } else if (e.getFullWeight() <= 200) {
                medium.add(e);
            } else {
                schwereKnochen.add(e);
            }
        }
        //Ausgabe Konsole: gibt dei Enten mit der toString-Methoode in der Konsole aus
        Set<Integer> keyset = entenListe.keySet();
        for(Integer s :keyset) {
            System.out.println("In der Kategorie " + s + "gramm sind " + entenListe.get(s));
        }
        return entenListe;
    }
    public void sortEntenNachGewicht(){
        Collections.sort(enten,Ente::compareTo);
        for (Ente e:enten) {
            System.out.println(e);
        }
    }
}