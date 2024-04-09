package Vererbung.Beispiele.Orchestra;

public abstract class  Intrument {
    private int lautstaerke;

    public Intrument(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }
    public abstract int play();

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }
}
