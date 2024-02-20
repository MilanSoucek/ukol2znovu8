import cz.engeto.ja.booking.Booking;
import cz.engeto.ja.bookingmanager.BookingManager;
import cz.engeto.ja.guests.Guest;
import cz.engeto.ja.room.Room;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

//        List<Guest> guests = new ArrayList<>();
//        guests.add(new Guest("Adela", "Malikova", LocalDate("13-3-1993")));
        Guest guest1 = new Guest("Jana Malikova",LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan Dvoracek", LocalDate.of(1995, 5, 5));
        Guest guest3 = new Guest("Karel Dvorak", LocalDate.of(1990, 5, 15));
        Room room1 = new Room(1 ,1 ,true , BigDecimal.valueOf(1000), true );
        Room room2 = new Room(2,1,true, BigDecimal.valueOf(1000), true );
        Room room3 = new Room(3,3,false, BigDecimal.valueOf(2400), true );
        BookingManager bookingManager = new BookingManager();
        bookingManager.addBooking(new Booking(room3,guest3,LocalDate.of(2023,6,1),LocalDate.of(2023,6,7),true));
        bookingManager.addBooking(new Booking(room2,guest2,LocalDate.of(2023,7,18),LocalDate.of(2023,7,21),false));

        for (int i = 1; i <= 20; i = i+2) {
            bookingManager.addBooking(new Booking(room2,guest2,LocalDate.of(2023,8,i),LocalDate.of(2023,8,i+1),false));

            bookingManager.addBooking(new Booking(room3,guest3,LocalDate.of(2023,8,1),LocalDate.of(2023,8,31),false));


        }

//        for (int i = 0; i < 8; i++){
//            Guest.add(new Guest(" ", LocalDate.of()));
//        }
//        for (Guest guest : Guest) {
            System.out.println(guest1.getName()+ " " +guest1.getBirthDate());
            System.out.println(guest2.getName()+ " " +guest2.getBirthDate());
            System.out.println(guest3.getName()+ " " +guest3.getBirthDate());
//    }

//        Room Room = new Room();
//        List<Room> rooms = new ArrayList<>();
//        rooms.add(new Room("Room1", " 2", " balcony", " 1000", " seaView"));
//        rooms.add(new Room("Room2", " 1", " balcony", " 1000", " seaView"));


//        for (int i = 0; i < 4; i++){
//            Room.add(new Room("" + i));
//        }
//        for (Room room : Room) {
            System.out.println(room1.getRoomNumber ( ) + " " + room1.getCapacity ( ) + room1.getBalcony ( ) + room1.getPrize ( ) + room1.getSeaView ( ));
            System.out.println("Rooms available:");
            System.out.println(room1+"Kč");
            System.out.println(room2+"Kč");
            System.out.println(room3+"Kč");
//        }
//        System.out.println("List of booking:");
//        bookingList.add(booking1);
//        bookingList.add(booking2);
//        bookingList.add(booking3);
//
//        bookingList.forEach(System.out::println);
//
    }
}