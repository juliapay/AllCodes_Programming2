package Vererbung.Beispiele.Land;

public class AppLand {
    public static void main(String[] args) {
        Land sued= new Land(1000);
        Land north = new Land(1000);
        Bundesstaat all= new Bundesstaat();
        all.addLand(sued);
        all.addLand(north);
        System.out.println(all.getBruttoSozialProdukt());

    }
}
