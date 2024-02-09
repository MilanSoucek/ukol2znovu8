package cz.engeto.ja.booking;

import java.time.LocalDate;


public class Booking {
    private Integer nights, prize, numberPeople;
    private LocalDate checkIn, checkOut;
    private Boolean typeVacation;

    public Booking(Integer nights,
                   Integer prize,
                   Integer numberPeople,
                   LocalDate checkIn,
                   LocalDate checkOut,
                   Boolean typeVacation) {
        this.nights = nights;
        this.prize = prize;
        this.numberPeople = numberPeople;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.typeVacation = typeVacation;
    }
//    public Booking (String name,) {
//        this(nights, prize, numberPeople, checkIn, checkOut, typeVacation);
//    }


//    public Booking() {
//
//    }
//    public Booking(Integer nights, Integer prize, Integer numberPeople,
//                   LocalDate checkIn, LocalDate checkOut,
//                   Boolean typeVacation) {
//    }

    public Booking(String nights) {
    }

    public Booking() {

    }


    public Integer getNights() {
        return nights;
    }

    public void setNights(Integer nights) {
        this.nights = nights;
    }

    public void setPrize(Integer prize) {
        this.prize = prize;
    }

    public void setNumberPeople(Integer numberPeople) {
        this.numberPeople = numberPeople;
    }

    public Boolean getTypeVacation() {
        return typeVacation;
    }

    public void setTypeVacation(Boolean typeVacation) {
        this.typeVacation = typeVacation;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public Integer getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public Integer getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public Boolean isTypeVacation() {
        return typeVacation;
    }

    public void setTypeVacation(boolean typeVacation) {
        this.typeVacation = typeVacation;
    }
}
