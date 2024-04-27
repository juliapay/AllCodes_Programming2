package AbstrakteKlassenInterface.Musikanten;

public abstract class Musikant {
    protected int anzahlbeine;
    protected Instrument instrument;

    public Musikant(int anzahlbeine, Instrument instrument) {
        this.anzahlbeine = anzahlbeine;
        this.instrument = instrument;
    }

    public int getAnzahlbeine() {
        return anzahlbeine;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    @Override
    public String toString() {
        return "verscheucht:"+verscheucheRaeuber()+
                ", Musiziert:"+spieleMusik();
    }
    public abstract int verscheucheRaeuber();
    public abstract double spieleMusik();
}
