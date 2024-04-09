package Vererbung.Beispiele.LogisticMaster;

public class Europalettes implements Moveable{
    private String color;


    public Europalettes(String color) {
        this.color = color;
    }

    @Override
    public void move(String destination) {
        System.out.println(color+" Europalettes will be moved to "+destination);
    }
}
