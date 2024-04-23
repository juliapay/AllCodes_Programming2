package AbstrakteKlassenInterface.Enten;

import AbstrakteKlassenInterface.Figures.Figure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Entenhausen {
    protected List<Ente> enten;

    //CONSTRUCTOR
    public Entenhausen() {
        this.enten = new ArrayList<>();//INTIALISING FIGURES
    }

    //METHOD FOR ADDING FIGURE
    public void addEnten(Ente e) {
        if (!enten.contains(e)) {//CONDITION FOR EMPTY PLACE
            enten.add(e);
        }
    }

    public Map<Integer, List<Ente>> getGruppierteEnten() {
        HashMap<Integer, List<Ente>> entenNachGewicht = new HashMap<>();
        List<Ente> tiny=new ArrayList<>();
        List<Ente> medium=new ArrayList<>();
        List<Ente> big=new ArrayList<>();

        for (Ente f : enten) {
            if (f.getfullWeight() < 100) {

                entenNachGewicht.put(100, tiny);
                tiny.add(f);
            }
            if (f.getfullWeight() > 100 || f.getfullWeight() <= 200) {
                entenNachGewicht.put(200, medium);
                medium.add(f);
            }
            if (f.getfullWeight() > 200||f.getfullWeight()<=300) {
                entenNachGewicht.put(300, big);
                big.add(f);
            }
        }
        return entenNachGewicht;

    }
}
