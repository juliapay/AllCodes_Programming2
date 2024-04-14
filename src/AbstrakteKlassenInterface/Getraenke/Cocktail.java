package AbstrakteKlassenInterface.Getraenke;

import java.util.ArrayList;
import java.util.List;

public class Cocktail extends Getraenk{

    protected List<Fluessigkeit> bestandteile;

    public Cocktail(String name) {
        super(name);
        this.bestandteile = new ArrayList<>();
    }



    @Override
    public int getAnzahlzutaten() {
        int counter=0;
        for (Fluessigkeit f:bestandteile) {
                counter++;
        }
        return counter;
    }

    @Override
    public boolean beinhaltetAlcohol() {
        for (Fluessigkeit f:bestandteile) {
            if (f.alkoholProzent>0){
                return true;
            }
        }
        return false;
    }

    @Override
    public double mengeInMl() {
        int sum=0;
        for (Fluessigkeit f:bestandteile) {
            if(f!=null){
                sum+=f.menge;
            }
        }
        return sum;
    }

    @Override
    public boolean brennt() {
        for (Fluessigkeit f:bestandteile) {
            if (f.alkoholProzent>30){
                return true;
            }
        }
        return false;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
