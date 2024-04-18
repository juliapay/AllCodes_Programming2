package Vererbung.Beispiele.RabbitHole;
import java.util.Comparator;
public class RabbitAgeNameComparator implements Comparator<Rabbit> {

    @Override
    public int compare(Rabbit o1, Rabbit o2) {
        int cmp= Integer.compare(o1.getAge(),o2.getAge());
        if (cmp!=0) {
            //ALTER IST SCHON UNTERSCHIEDLICH
            //MÜSSEN NAMEN NICHT MEHR BERÜCKSICHTIGEN
            return cmp;
        }
        //FALLS ALTER GLEICH IST
        return Integer.compare(o1.getNrCarrots(),o2.getNrCarrots()) ;
        //AUFSTEIGEND SORTIEREN
        //FALLS ABSTEIGEND SORTIERT ZB CMP*-1
    }

}
