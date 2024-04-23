package AbstrakteKlassenInterface.musikanten;

import java.util.Comparator;

public class LautstaerkeComparator implements Comparator<Musikant> {

    @Override
    public int compare(Musikant o1, Musikant o2) {
        int cmp= Double.compare(o1.spieleMusik(),o2.spieleMusik());
        if (cmp!=0) {
            return cmp*-1;
        }
        return 0;
    }
}
