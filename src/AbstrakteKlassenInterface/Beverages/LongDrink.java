package AbstrakteKlassenInterface.Beverages;

public class LongDrink extends Getraenk{
    protected Fluessigkeit spirituose;
    protected Fluessigkeit filler;

    public LongDrink(String name, Fluessigkeit spirituose, Fluessigkeit filler) {
        super(name);
        this.spirituose = spirituose;
        this.filler = filler;
    }

    @Override
    public int getAnzahlZutaten() {
        return 2;
    }

    @Override
    public boolean beinhaltetAlkohol() {
        if(filler.getProzentAlkohol()+spirituose.getProzentAlkohol()>30){
            return true;
        }
        return false;
    }

    @Override
    public double mengeInMl() {
        return spirituose.getMenge()+ filler.getMenge();
    }
}
