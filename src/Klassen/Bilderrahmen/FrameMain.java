package Klassen.Bilderrahmen;

import java.util.ArrayList;
import java.util.List;

public class FrameMain {
    public static void main(String[] args) {
        BackBoard backBoard= new BackBoard(Matrial.CARDBOARD,300.0,
                Color.BLACK,true,false,true);
        Passepartout passepartout=new Passepartout(BoardWeight.STANDARD,
                PositionCutOut.TOP,Color.ORANGE,true,
                12.5,16.5);
        Frame frame = new Frame(20.0,20.0,5.0,3,
                Matrial.SILVER,Glass.CLEAR,Color.BLUE,backBoard,passepartout);

        List<Frame> shoppingbasket = new ArrayList<>();
        shoppingbasket.add(frame);
        System.out.println("In meinem Einkaufskorb sind: "+shoppingbasket.size()+" Produkte");
        for (Frame shopping:shoppingbasket) {
            System.out.println(shopping);
        }


    }
}
