package cz.engeto.ja.bookingmanager;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<cz.engeto.ja.booking.Booking> bookingList = new ArrayList<>();

    public void addBooking(cz.engeto.ja.booking.Booking booking) {
        bookingList.add(booking);
    }

    public void removeBooking(cz.engeto.ja.booking.Booking booking) {
        bookingList.remove(booking);
    }

    public List<cz.engeto.ja.booking.Booking> getBookings() {
        return new ArrayList<>(bookingList);
    }
}
