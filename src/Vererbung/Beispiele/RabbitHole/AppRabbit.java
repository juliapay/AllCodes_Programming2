package Vererbung.Beispiele.RabbitHole;

import Vererbung.Beispiele.Dogs.DogAgeNameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class AppRabbit {
    public static void main(String[] args) {

        Rabbit r = new Rabbit("Hoppi", 3, 67);
        ChristmasRabbit c = new ChristmasRabbit("Snowi", 3, 45);
        EasterRabbit e = new EasterRabbit("Eggi", 6, 100);

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
        h.addRabbit(new Rabbit("Bunni", 2, 34));
        h.hoppelSpecial();
        System.out.println("--------------------------");
        Hedgehog sonic = new Hedgehog(1000, "Soni");
        List<PartyGoer> invited = new ArrayList<>();
        invited.add(c);
        invited.add(e);
        invited.add(r);
        invited.add(sonic);
        for (PartyGoer p : invited) {
            p.party("drinks");
        }
        System.out.println("-------------COMPARATOR----------");
        List<Rabbit> rabbitList = new ArrayList<>();
        rabbitList.add(r);
        rabbitList.add(c);
        rabbitList.add(e);
        Collections.sort(rabbitList, new RabbitAgeNameComparator());
        System.out.println(rabbitList);
        System.out.println("-------------COMPARATOR REVERSED-------");
        Collections.sort(rabbitList, new RabbitAgeNameComparator().reversed());
        System.out.println(rabbitList);


    }
}
