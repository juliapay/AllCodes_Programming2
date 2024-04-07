package UebungHotel;

public class Key {
    private int roomNumber;
    boolean withGuest;

    public Key(int roomNumber) {
        this.roomNumber = roomNumber;
        this.withGuest = withGuest;
    }

    public Key() {
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isWithGuest() {
        return withGuest;
    }

    public void setWithGuest(boolean withGuest) {
        this.withGuest = withGuest;
    }
}
