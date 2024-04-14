package Vererbung.Beispiele.Konto;

public class AppKonto {
    public static void main(String[] args) {
        JugendGiroKonto j = new JugendGiroKonto("Pablo", 20.00, 50.00);
        GiroKonto g = new GiroKonto("Mia", 1000.00);
        SparKonto s = new SparKonto("Jose");
        Konto ko = new Konto("Charlie");
        ko.einzahlen(1000.00);
        ko.auszahlen(200);
        System.out.println("-----------------------------");
        System.out.println(ko.kontoStand);
        j.einzahlen(10);
        System.out.println("Jugendkonto Kontostand "+j.kontoStand);
        j.auszahlen(25);
        System.out.println("Limit Überschreitung JugendGirokonto-----------");
        j.auszahlen(60);
        System.out.println("-----------------------------");
        System.out.println(j.kontoStand);
        System.out.println("Limit Überschreitung Girokonto-----------");
        g.einzahlen(2000);
        g.auszahlen(4000);
        System.out.println("Sparkonto--------------");
        s.einzahlen(2000);
        s.auszahlen(1000);
        System.out.println(s.kontoStand);



        System.out.println("Upcasting----------------");
        Konto kCasting = j;
        System.out.println("Casting jugendkonto in konto "+kCasting.kontoStand);
        System.out.println("einzahlen 100");
        kCasting.einzahlen(100);
        System.out.println("Casting jugendkonto in konto "+kCasting.kontoStand);
        kCasting.auszahlen(60);
        System.out.println(kCasting.kontoStand);
        System.out.println("Downcasting---------------");
        GiroKonto gCasting=(GiroKonto) kCasting;
        kCasting.einzahlen(200);
        kCasting.auszahlen(500);
        System.out.println("-----------------------------");
        System.out.println(kCasting.kontoStand);

    }
}
