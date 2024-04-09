package Vererbung.Beispiele.Orchestra;

public class Pauke extends Intrument{

    public Pauke(int lautstaerke) {
        super(lautstaerke);
    }
    @Override
    public int play() {

        System.out.println("Pauke wird geschlagen");
        return getLautstaerke();
    }

}
