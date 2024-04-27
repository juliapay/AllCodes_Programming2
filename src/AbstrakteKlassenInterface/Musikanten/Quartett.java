package AbstrakteKlassenInterface.Musikanten;

import java.util.*;

public class Quartett {
    private List<Musikant> quartett;

    public Quartett() {
        this.quartett = new ArrayList<>();
    }
    public void add(Musikant m) {
        if (!quartett.contains(m)) {
            quartett.add(m);
        }
    }
    public boolean istQuartett() {
        if (quartett.size() == 4) {
            return true;
        }
        return false;
    }
    public int gemeinsamRaeuberVerscheucht() {
        int sum = 0;
      /*  for (Musikant m:quartett) {
            sum+=m.verscheucheRaeuber();
        }
        return sum;*/
        Iterator<Musikant> iterator = quartett.iterator();

        while (iterator.hasNext()) {
            Musikant m = iterator.next();
            sum += m.verscheucheRaeuber();
        }
        return sum;
    }

    public double durchschnittlicheLautstaerke() {
        int sum = 0;
        int count = 0;
        for (Musikant m : quartett) {
            sum += m.spieleMusik();
            count++;
        }
        return sum / count;
    }

    public ArrayList<Musikant> getMusikantenInLautstaerkeBereich(double von, double bis) {
        ArrayList<Musikant> musikants = new ArrayList<>();
        for (Musikant m : quartett) {
            if (m.spieleMusik() > von && m.spieleMusik() < bis) {
                musikants.add(m);
            }
        }
        return musikants;
    }
public HashMap<Integer, Integer> getAnzahlMusikantenMitBeinAnzahl() {
    HashMap<Integer, Integer> musikantenBeine = new HashMap<>();
    for (Musikant m : quartett) {
        int beine= m.getAnzahlbeine();
        if(musikantenBeine.containsKey(beine)){
            musikantenBeine.put(beine,musikantenBeine.get(beine)+1);
        }else{
            musikantenBeine.put(beine,1);
        }
    }
    //       Set<Integer> keyset = beineAnzahl.keySet();
    //       for (Integer s : keyset) {
    //           System.out.println(beineAnzahl.get(s) + " Tiere haben " + s + " Beine");
    //      }
    return musikantenBeine;
}


    public void printLautStaerkeAbsteigend() {
        LautstaerkeComparator lautstaerkeComparator = new LautstaerkeComparator();
        Collections.sort(quartett, lautstaerkeComparator);
        System.out.println("Musikanten absteigen nach ihrer Lautstärke sortiert");
        for (Musikant g : quartett) {
            System.out.println(g);
        }
    }
}
