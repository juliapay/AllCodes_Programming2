package AbstrakteKlassenInterface.Beverages;

import java.util.Comparator;

public class AnzahlZutatenComparator implements Comparator<Getraenk> {
    @Override
    public int compare(Getraenk o1, Getraenk o2) {
        return Integer.compare(o1.getAnzahlZutaten(),(o2.getAnzahlZutaten()));
    }
}
