package AbstrakteKlassenInterface.Getraenke;

import java.util.Comparator;

public class AnzahlZutatenComparator implements Comparator<Getraenk> {

    @Override
    public int compare(Getraenk o1, Getraenk o2) {
        int keyComparison = Integer.compare(o1.getAnzahlzutaten(), o2.getAnzahlzutaten());
        if (keyComparison != 0) {
            return keyComparison;
        }
        return 0;

    }

}
