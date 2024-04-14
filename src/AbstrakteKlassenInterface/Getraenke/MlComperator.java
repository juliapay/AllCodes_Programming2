package AbstrakteKlassenInterface.Getraenke;

import java.util.Comparator;

public class MlComperator implements Comparator<Getraenk> {

    @Override
    public int compare(Getraenk o1, Getraenk o2) {
        int keyComparison = Double.compare(o1.mengeInMl(), o2.mengeInMl());
        if (keyComparison != 0) {
            return keyComparison;
        }
        return 0;
    }
}
