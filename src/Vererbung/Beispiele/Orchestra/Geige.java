package Vererbung.Beispiele.Orchestra;

public class Geige extends Intrument {

    public Geige(int lautstaerke) {
        super(lautstaerke);
    }

    @Override
    public int play() {
        System.out.println("Geige wird gestrichen");
        return getLautstaerke();
    }
}
