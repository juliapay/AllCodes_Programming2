package AbstrakteKlassenInterface.Beverages;

public class AppGetraenke {
    public static void main(String[] args) {
        SimplesGetraenk s1 = new SimplesGetraenk("Wasser", new Fluessigkeit("Wasser", 250, 0));
        SimplesGetraenk s2 = new SimplesGetraenk("cola", new Fluessigkeit("Cola", 250, 0));
        LongDrink l1 = new LongDrink("ColaRum", new Fluessigkeit("rum", 50, 30), new Fluessigkeit("cola", 200, 0));
        LongDrink l2 = new LongDrink("GinTonic", new Fluessigkeit("gin", 50, 30), new Fluessigkeit("tonic", 150, 0));
        Registrierkasse registrierkasse = new Registrierkasse();
        registrierkasse.verkaufteGetraenke(s1);
        registrierkasse.verkaufteGetraenke(s2);
        registrierkasse.verkaufteGetraenke(l1);
        registrierkasse.verkaufteGetraenke(l2);

        registrierkasse.getGetraenkeaufgeteiltNachZutaten();
        registrierkasse.printGetraenkesortiertNachAnzahlZutaten();
        registrierkasse.printGetraenkeSortiertNachMl();


    }
}
