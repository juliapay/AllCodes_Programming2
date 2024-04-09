package Vererbung.Beispiele.RabbitHole;

import java.util.ArrayList;
import java.util.List;

public class AppRabbit {
    public static void main(String[] args) {

        Rabbit r = new Rabbit("Hoppi");
        ChristmasRabbit c = new ChristmasRabbit("Snowi");
        EasterRabbit e= new EasterRabbit("Eggi");

        r.rabbitHop();
        r.rabbitEat();
        r.rabbitSleep();
        c.rabbitHop();
        c.bringsPresents();
        e.rabbitHop();// Override method rabbitHop
        // der List hinzufügen
        RabbitHutch h = new RabbitHutch();

        h.addRabbit(c);
        h.addRabbit(e);

        h.allRabbitsHop();
        System.out.println("--------------------------");
        h.addRabbit(new Rabbit("Bunni"));
        h.hoppelSpecial();
        System.out.println("--------------------------");
        Hedgehog sonic = new Hedgehog(1000,"Soni");
        List<PartyGoer> invited = new ArrayList<>();
        invited.add(c);
        invited.add(e);
        invited.add(r);
        invited.add(sonic);
        for (PartyGoer p:invited) {
            p.party("drinks");
        }
    }
}
