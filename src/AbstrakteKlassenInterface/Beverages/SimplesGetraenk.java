package AbstrakteKlassenInterface.Beverages;

public class SimplesGetraenk extends Getraenk{

    protected Fluessigkeit bestandteil;

    public SimplesGetraenk(String name, Fluessigkeit bestandteil) {
        super(name);
        this.bestandteil = bestandteil;
    }

    @Override
    public int getAnzahlZutaten() {
        return 1;
    }

    @Override
    public boolean beinhaltetAlkohol() {
        if(bestandteil.getProzentAlkohol()>30){
            return true;
        }
        return false;
    }

    @Override
    public double mengeInMl() {
        return bestandteil.getMenge();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
