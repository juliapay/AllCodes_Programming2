package UebungHotel.KeyRack;



public class KeyRack {

    private Key[] keys;
    int numberOfRooms;



    public KeyRack(int numberOfRooms, Key[] keys) {
        this.keys = new Key[numberOfRooms];
        this.numberOfRooms = numberOfRooms;
    }

    public void showKeyRack(Key[] keys) {

        for (int i = 0; i < keys.length; i++) {
            System.out.println(keys[i]);
            System.out.println();
        }
    }

    public void giveKeyToGuest(Guest guest, Key[] keys) {
        int roomNumber = guest.getRoomNumber();
        Key key = keys[roomNumber];
        if (key != null) {
            guest.setKey(key);
            key.setWithGuest(true); // you can also set the key null, so it is completely out of the keyrack
        } else {
            System.out.println("Missing key, alert police!");
        }
    }

    public void takeKeyBackFromGuest(Guest guest) {

        Key key = guest.getKey();

        key.setWithGuest(false);
        guest.setKey(null);
        key.setWithGuest(false);

    }
}
