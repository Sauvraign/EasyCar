package fr.sauvraign;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Booking> bookings = new ArrayList<Booking>(); 
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String postalCode;

    public Customer(String firstName, String lastName, String address, String city, String postalCode, ArrayList<Booking> bookings) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.bookings = bookings;
    }
    public Customer(String firstName, String lastName, String address, String city, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
    }

    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }

    public void removeBooking(Booking booking) {
        this.bookings.remove(booking);
    }

    @Override
    public String toString() {
        return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
                + ", postalCode=" + postalCode + "]";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public double totalMoneySpent() {
        double totalMoneySpent = 0.0;
        for(int i = 0; i < this.bookings.size(); i++){
            Booking book = bookings.get(i);
            totalMoneySpent = totalMoneySpent + book.totalPrice();
        }
        return totalMoneySpent;
    }

    public ArrayList<Booking> getBooking() {
        return bookings;
    }
}
