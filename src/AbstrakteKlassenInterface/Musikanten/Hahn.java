package AbstrakteKlassenInterface.Musikanten;

public class Hahn extends Musikant {
    protected int flugWeite;

    public Hahn(int aB, Instrument i, int flugWeite) {
        super(aB, i);
        this.flugWeite = flugWeite;
    }

    public int getFlugWeite() {
        return flugWeite;
    }

    @Override
    public String toString() {
        return "Hahn " + flugWeite + ": " + super.toString();
    }

    @Override
    public int verscheucheRaeuber() {
        if (flugWeite < 2) {
            return (int) Math.floor(instrument.getLautstaerke());
        }if (flugWeite>=2||flugWeite<=6){
            return (int) Math.floor(8-flugWeite);
        }
        return 1;
    }

    @Override
    public double spieleMusik() {
        return (instrument.getLautstaerke()+2)/flugWeite;
    }
}
