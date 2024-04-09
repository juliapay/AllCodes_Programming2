package Vererbung.Beispiele.Orchestra;

public class Gitarre extends Intrument{

    public Gitarre(int lautstaerke) {
        super(lautstaerke);


    }

    @Override
    public int play() {

        System.out.println("Gitarre wird gezupft");
        return getLautstaerke();
    }
}
