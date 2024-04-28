package AbstrakteKlassenInterface.Enten;

import java.util.Collections;

public class AppEnten {
    public static void main(String[] args) {
        BadeEnte b1 = new BadeEnte("Qak", 34, 35);
        BadeEnte b2 = new BadeEnte("Quk", 150, 45);
        BadeEnte b3 = new BadeEnte("Qik", 360, 100);
        FlugEnte f1 = new FlugEnte("Dak", 36, 23);
        FlugEnte f2 = new FlugEnte("Duk", 160, 70);
        FlugEnte f3 = new FlugEnte("Dik", 490, 23);
        Entenhausen entenhausen = new Entenhausen();
        entenhausen.addEnte(b1);
        entenhausen.addEnte(b2);
        entenhausen.addEnte(b3);
        entenhausen.addEnte(f1);
        entenhausen.addEnte(f2);
        entenhausen.addEnte(f3);
        entenhausen.getGruppierteEnten();
        entenhausen.sortEntenNachGewicht();


    }

}
