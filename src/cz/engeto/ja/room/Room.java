package cz.engeto.ja.room;

import java.math.BigDecimal;

public class Room {
    private int roomNumber; int capacity; boolean balcony; BigDecimal prize; boolean seaView;

    public Room(int roomNumber, int capacity, boolean balcony, BigDecimal prize, boolean seaView) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.balcony = balcony;
        this.prize = prize;
        this.seaView =seaView;
    }

    public Room(String roomNumber) {
    }
//    public Room (String name) {
//        this("", "", "", "", "");
//    }

//    public Room(String roomNumber, String capacity, String balcony, String prize, String seaView) {
//    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean getBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public BigDecimal getPrize() {
        return prize;
    }

    public void setPrize(BigDecimal prize) {
        this.prize = prize;
    }

    public boolean getSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }
}
