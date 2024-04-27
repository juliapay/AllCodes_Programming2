package AbstrakteKlassenInterface.Beverages;

import java.util.*;

public class Registrierkasse {
    protected List<Getraenk> getraenke;
    protected static int verkaufteGetraenke;

    public Registrierkasse() {
        this.getraenke = new ArrayList<>();
        this.verkaufteGetraenke = verkaufteGetraenke;
    }

    public static int getVerkaufteGetraenke() {
        return verkaufteGetraenke;
    }

    public void verkaufteGetraenke(Getraenk g) {
        if (getraenke != null) {
            if (!getraenke.contains(g)) {
                getraenke.add(g);
                verkaufteGetraenke++;
            }
        }
    }
    public void printGetraenkesortiertNachAnzahlZutaten(){
        AnzahlZutatenComparator anzahlZutatenComparator=new AnzahlZutatenComparator();
        Collections.sort(getraenke,anzahlZutatenComparator);
        System.out.println(getraenke);
    }
    public void printGetraenkeSortiertNachMl(){
        MlComparator mlComparator=new MlComparator();
        Collections.sort(getraenke,mlComparator);
        System.out.println(getraenke);
    }
    public HashMap<Integer, ArrayList<Getraenk>> getGetraenkeaufgeteiltNachZutaten() {
        HashMap<Integer, ArrayList<Getraenk>> getraenkListe = new HashMap<>();
        if (getraenke != null) {
            for (int i = 0; i < getraenke.size(); i++) {
                Getraenk g = getraenke.get(i);
                if (getraenkListe.containsKey(g.getAnzahlZutaten())) {
                    ArrayList<Getraenk> gesamt = getraenkListe.get(g.getAnzahlZutaten());
                    gesamt.add(g); // Add directly to the retrieved ArrayList
                } else {
                    ArrayList<Getraenk> gesamt = new ArrayList<>();
                    gesamt.add(g);
                    getraenkListe.put(g.getAnzahlZutaten(), gesamt);
                }
            }
        }
        Set<Integer> keyset = getraenkListe.keySet();
        for (Integer s : keyset) {
            System.out.println(s + " Zutaten haben diese Getränke " + getraenkListe.get(s));
        }

        return getraenkListe;
    }
}
