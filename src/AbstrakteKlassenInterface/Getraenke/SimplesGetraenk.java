package AbstrakteKlassenInterface.Getraenke;

public class SimplesGetraenk extends Getraenk{

protected Fluessigkeit bestandteil;

    public SimplesGetraenk(String name, Fluessigkeit bestandteil) {
        super(name);
        this.bestandteil = bestandteil;
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
    public boolean beinhaltetAlcohol() {
        if (bestandteil.alkoholProzent>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean brennt() {
        if (bestandteil.alkoholProzent>30){
            return true;
        }
        return false;
    }


    @Override
    public double mengeInMl() {

        return bestandteil.menge;
    }

    @Override
    public int getAnzahlzutaten() {
        return 1;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
