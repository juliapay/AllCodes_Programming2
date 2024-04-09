package Vererbung.Beispiele.RabbitHole;

import java.util.ArrayList;
import java.util.List;

public class RabbitHutch {
    private List<Rabbit> rabbits;

    public RabbitHutch() {
        rabbits = new ArrayList<>();
    }
    //jeder hase er in der liste ist, wurde bereits abgecastet
    public void addRabbit(Rabbit a) {
        if (!rabbits.contains(a)){
            rabbits.add(a);
        }
    }

    public void allRabbitsHop(){
        for (Rabbit r : rabbits) {
            r.rabbitHop();
        }
    }
    //laesst jeden Hasen hoppeln und Weihnachtshasen geschenke verteilen und
    //osterhasen eier verteilen
    public void hoppelSpecial(){
        for (Rabbit r:rabbits){
            r.rabbitHop();
            //liefert uns nur true wenn ein osterhase (oder eine von dort abgeleitete Klasse ist)
            if (r instanceof EasterRabbit){
                //hier können wir sicher downcasten
                EasterRabbit easti= (EasterRabbit) r;
                easti.rabbitHop();
            }
            if (r instanceof ChristmasRabbit){
                ChristmasRabbit winti = (ChristmasRabbit) r;
                winti.bringsPresents();
            }
        }
    }

}
