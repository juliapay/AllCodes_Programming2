package AbstrakteKlassenInterface.Beverages;

import java.util.ArrayList;
import java.util.List;

public class Cocktail extends Getraenk{

    protected List<Fluessigkeit> bestandteile;

    public Cocktail(String name, List<Fluessigkeit> bestandteile) {
        super(name);
        this.bestandteile = new ArrayList<>();
    }

    @Override
    public int getAnzahlZutaten() {

        return bestandteile.size();
    }

    @Override
    public boolean beinhaltetAlkohol() {
        double sum=0;
        if(bestandteile!=null){
            for (Fluessigkeit f:bestandteile) {
                sum+=f.getProzentAlkohol();
            }
        }
        if(sum>30){
            return true;
        }
        return false;
    }

    @Override
    public double mengeInMl() {
        double sum=0;
        if(bestandteile!=null){
            for (Fluessigkeit f:bestandteile) {
                sum+=f.getMenge();
            }
        }
        return sum;
    }
}
