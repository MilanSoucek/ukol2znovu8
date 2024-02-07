import cz.engeto.ja.guests.Guest;
import cz.engeto.ja.room.Room;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Guest> guests = new ArrayList<>();
        guests.add(new Guest("Adela", "Malikova", " 13.3.1993 "));
        guests.add(new Guest("Jana", "Dvoracka", " 5.5.1995 "));

        for (int i = 0; i < 8; i++){
            guests.add(new Guest("" + i));
        }
        for (Guest guest : guests) {
            System.out.println(guest.getName()+ " " +guest.getSurname()+guest.getBirthdate());
        }

//        Room Room = new Room();
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room("Room1", "1", "balcony", "1000"));
        rooms.add(new Room("Room2", "1", "balcony", "1000"));


        for (int i = 0; i < 4; i++){
            rooms.add(new Room("" + i));
        }
        for (Room room : rooms) {
            System.out.println(room.getRoomNumber()+ " " +room.getCapacity()+room.getBalcony());
        }
    }
}