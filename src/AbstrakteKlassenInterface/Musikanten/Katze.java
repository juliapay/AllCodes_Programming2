package AbstrakteKlassenInterface.Musikanten;

public class Katze extends Musikant {
    protected double kratzKraft;

    public Katze(int aB, Instrument i, double kratzKraft) {
        super(aB, i);
        this.kratzKraft = kratzKraft;
    }

    public double getKratzKraft() {
        return kratzKraft;
    }

    @Override
    public String toString() {
        return "Katze "+kratzKraft+": "+ super.toString();
    }

    @Override
    public int verscheucheRaeuber() {
        if(super.anzahlbeine==3){
            kratzKraft=kratzKraft/2;
        } else if (super.anzahlbeine<=2) {
            kratzKraft=1;
        }
        return (int) Math.floor(kratzKraft);
    }

    @Override
    public double spieleMusik() {
        return instrument.getLautstaerke();
    }
}
