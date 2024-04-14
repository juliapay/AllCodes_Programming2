package AbstrakteKlassenInterface.Getraenke;

public class LongDrink extends Getraenk {
    protected Fluessigkeit spirituose;
    protected Fluessigkeit filler;

    public LongDrink(String name, Fluessigkeit spirituose, Fluessigkeit filler) {
        super(name);
        this.spirituose = spirituose;
        this.filler = filler;
    }


    @Override
    public int getAnzahlzutaten() {
        return 2;
    }

    @Override
    public boolean beinhaltetAlcohol() {
        if (spirituose.alkoholProzent>0){
            return true;
        }
        return false;
    }

    @Override
    public double mengeInMl() {

        return spirituose.menge + filler.menge;
    }

    @Override
    public boolean brennt() {
        if (spirituose.alkoholProzent>30){
            return true;
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
