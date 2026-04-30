package fr.sauvraign;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Booking {
    private Vehicle vehicle;
    private Customer customer;
    private LocalDate startDate;
    private LocalDate endDate;
	private boolean paid;

    public Booking(LocalDate startDate, 
                    LocalDate endDate,  
                    boolean paid, 
                    Vehicle vehicle, 
                    Customer customer) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.startDate = startDate;
        this.endDate = endDate;
        this.paid = paid;
    }
    
    @Override
    public String toString() {
        return "Booking [startDate=" + startDate + ", endDate=" + endDate + ", paid=" + paid + ", customer=" + customer + "\n, vehicle=" + vehicle + "]";
    }
    
    public double totalPrice() {
        long diffInDays = ChronoUnit.DAYS.between(startDate,endDate);
        double totalPrice = diffInDays * vehicle.getPricePerDay();
        return totalPrice;
    }
    
    public Vehicle getVehicle() {
        return vehicle;
    }
    public Customer getCustomer() {
        return customer;
    }
    
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

}
