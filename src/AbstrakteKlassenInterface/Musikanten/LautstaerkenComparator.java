package AbstrakteKlassenInterface.Musikanten;

import java.util.Comparator;

public class LautstaerkenComparator implements Comparator<Musikant> {

    @Override
    public int compare(Musikant o1, Musikant o2) {
return (Double.compare(o1.spieleMusik(),o2.spieleMusik()))*-1;
    }
}
