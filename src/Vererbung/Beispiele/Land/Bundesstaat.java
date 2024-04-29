package Vererbung.Beispiele.Land;

import java.util.ArrayList;
import java.util.List;

public class Bundesstaat extends Land{
private List<Land> laender;
    public Bundesstaat() {
        laender = new ArrayList<>();
    }

    public void addLand(Land l) {

        if (!laender.contains(l)) {
            laender.add(l);
        }
    }

    @Override
    public double getBruttoSozialProdukt() {
        double sumBruttoSozialProdukt = 0;
        for (Land l : laender) {
            sumBruttoSozialProdukt += l.getBruttoSozialProdukt();
        }

        return sumBruttoSozialProdukt;
    }
}
