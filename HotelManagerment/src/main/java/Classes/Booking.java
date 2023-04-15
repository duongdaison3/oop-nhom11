/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DUONG DAI SON
 */
package Classes;

import java.util.ArrayList;
import java.util.Date;

public class Booking {
    private UserInfor customer;
    ArrayList<Room> rooms;
    
    private int booking_id;
    private long checkInDateTime;
    private long checkOutDateTime;
    private String bookingType;
    private int person;
    
    public Booking(){
        customer = new UserInfor();
        rooms = new ArrayList<>();
        booking_id = -1;
        bookingType = "Reserverd";
    }
    public int getBooking_id(){
        return booking_id;
    }
    public void setBooking_id(int booking_id){
        this.booking_id = booking_id;
    }
    public String getBookingType(){
        return bookingType;
    }
    public void setBookingType(String bookingType){
        this.bookingType = bookingType;
    }
        public void addRoom(String roomNo)
    {
        rooms.add(new Room(roomNo));
        
    }
    
    public void removeRoom(String roomNo)
    {
        for(Room a: rooms)
        {
            if(a.getRoom_no().equals(roomNo))
            {
                rooms.remove(a);
            }
        }
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }
    
    public int getRoomsFare()
    {
        int total = 0;
        for(Room room:rooms)
        {
            total += room.getRoom_class().getPricePerDay();
        }
        return total;
    }

    public UserInfor getCustomer() {
        return customer;
    }

    public void setCustomer(UserInfor customer) {
        this.customer = customer;
    }

    

    public void setCheckOutDateTime(int checkOutDateTime) {
        this.checkOutDateTime = checkOutDateTime;
    }

    public long getCheckInDateTime() {
        return checkInDateTime;
    }

    public void setCheckInDateTime(long checkInDateTime) {
        this.checkInDateTime = checkInDateTime;
    }

    public long getCheckOutDateTime() {
        return checkOutDateTime;
    }

    public void setCheckOutDateTime(long checkOutDateTime) {
        this.checkOutDateTime = checkOutDateTime;
    }
}
