package AbstrakteKlassenInterface.Getraenke;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

public class AppGetraenke {
    public static void main(String[] args) {
        Fluessigkeit wasser = new Fluessigkeit("Wasser", 200, 0);
        Fluessigkeit gin = new Fluessigkeit("Gin", 20, 40);
        Fluessigkeit vodka = new Fluessigkeit("Vodka", 20, 40);
        Fluessigkeit cola = new Fluessigkeit("Cola", 200, 40);
        Fluessigkeit zitronensaft = new Fluessigkeit("Zitrone", 5, 0);
        Fluessigkeit rum = new Fluessigkeit("Rum", 30, 40);
        Fluessigkeit tonic = new Fluessigkeit("Tonic", 200, 0);

        SimplesGetraenk s1 = new SimplesGetraenk("Wasser", wasser);
        SimplesGetraenk s2 = new SimplesGetraenk("Saft", zitronensaft);
        LongDrink l1 = new LongDrink("Cola-Rum", rum, cola);
        LongDrink l2 = new LongDrink("Gin-Tonic", gin, tonic);

        Cocktail c1 = new Cocktail("Shanghai-Baby");
        c1.bestandteile.add(gin);
        c1.bestandteile.add(zitronensaft);
        c1.bestandteile.add(vodka);
        Cocktail c2 = new Cocktail("Basil-Smash");
        c2.bestandteile.add(gin);
        c2.bestandteile.add(wasser);
        c2.bestandteile.add(rum);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(c1);
        System.out.println(c2);
        Registrierkasse register = new Registrierkasse();
        register.verkauft(s1);
        register.verkauft(s2);
        register.verkauft(l1);
        register.verkauft(l2);
        register.verkauft(c1);
        register.verkauft(c2);

        System.out.println("Anzahl verkaufter Getränke: "+register.getVerkaufteGetraenke());
        System.out.println("-----------------------------");
        System.out.println("Verkaufte Getränke: ");
        register.printCreatedHashMap();
        System.out.println("-----------------------------");
        register.printGetraenkeSortiertNachMl();
        System.out.println("-----------------------------");
        register.printGetraenkeSortiertNachAnzahlZutaten();
    }
}
