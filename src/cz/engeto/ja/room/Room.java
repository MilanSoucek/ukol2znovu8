package cz.engeto.ja.room;

public class Room {
    private String roomNumber, capacity, balcony, prize, seaview;

    public Room(String roomNumber, String capacity, String balcony, String prize, String seaview) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.balcony = balcony;
        this.prize = prize;
        this.seaview = seaview;
    }
    public Room (String name) {
        this("", "", "", "", "");
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getBalcony() {
        return balcony;
    }

    public void setBalcony(String balcony) {
        this.balcony = balcony;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public String getSeaview() {
        return seaview;
    }

    public void setSeaview(String seaview) {
        this.seaview = seaview;
    }
}
