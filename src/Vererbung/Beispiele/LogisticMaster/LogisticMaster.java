package Vererbung.Beispiele.LogisticMaster;

import Vererbung.Beispiele.Orchestra.Intrument;

import java.util.ArrayList;
import java.util.List;

public class LogisticMaster {

    List<Moveable> moveableObjects = new ArrayList<>();

    public void addMoveable(Moveable a) {
        if (!moveableObjects.contains(a)) {
            moveableObjects.add(a);
        }
    }

    public void moveAll(String destination) {

        for (Moveable mov : moveableObjects) {
            System.out.println();
            mov.move(destination);
        }
    }
}
