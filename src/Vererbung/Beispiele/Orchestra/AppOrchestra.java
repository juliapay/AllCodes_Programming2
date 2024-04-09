package Vererbung.Beispiele.Orchestra;

public class AppOrchestra {
    public static void main(String[] args) {
        Gitarre g=new Gitarre(1);
        Pauke p = new Pauke(2);
        Geige ge = new Geige(3);
        Orchestra orchestra= new Orchestra();
        orchestra.addInstrument(g);
        orchestra.addInstrument(p);
        orchestra.addInstrument(ge);
        System.out.println(orchestra.playAllInstruments());

    }
}
