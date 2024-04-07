package UebungHotel;

import UebungHotel.Guest;
import UebungHotel.Key;

public class KeyRack {

    private Key[] keys;
    int numberOfRooms;


    public KeyRack(int numberOfRooms) {
        this.keys = new Key[numberOfRooms];
        this.numberOfRooms = numberOfRooms;
    }

    public void showKeyRack(){

        for (int i = 0; i < keys.length; i++) {
            System.out.println(keys[i]);
            System.out.println();
        }
    }
    public void giveKeyToGuest(String name){
        Guest guest = new Guest(name);

        for (int i = 0; i < keys.length; i++) {
            if(keys[i]!=null&&keys[i]==guest.getKey()){
                Key key = new Key(i);
                guest.setKey(key);
                key.setWithGuest(true);
                keys[i]=null;
            }
        }
    }
    public void takeKeyBackFromGuest(){

    }
}
