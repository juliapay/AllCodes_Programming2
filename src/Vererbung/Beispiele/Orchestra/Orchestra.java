package Vererbung.Beispiele.Orchestra;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {
    private List<Intrument> instruments;

    public Orchestra() {
        instruments = new ArrayList<>();
    }
    public void addInstrument(Intrument a) {
        if (!instruments.contains(a)){
            instruments.add(a);
        }
    }
    public int playAllInstruments(){
        int lautstaerkeGesamt=0;
        for (Intrument ins : instruments) {
            lautstaerkeGesamt+=ins.getLautstaerke();
            ins.play();
        }
        return lautstaerkeGesamt;
    }

}
