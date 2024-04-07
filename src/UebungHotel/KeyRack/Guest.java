package UebungHotel.KeyRack;

import Key;

public class Guest {
    private  String name;
    private Key key;
    private int roomNumber;

    public Guest(String name, int roomNumber) {
        this.name = name;
        this.key = key;
        //no roomnumber 0
        this.roomNumber = roomNumber-1;
    }

    public Guest(String name) {
        this.name = name;
        this.key = key;
        this.roomNumber = roomNumber;
    }
    public Guest() {
        this.name = name;
        this.key = key;
        this.roomNumber = roomNumber;
    }
    public Guest(int roomNumber) {
        this.name = name;
        this.key = key;
        this.roomNumber = roomNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
