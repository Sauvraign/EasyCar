package fr.sauvraign;

import java.time.LocalDate;

public class Car extends MotorizedVehicle {
    private int seats;

    public Car(String brand, String model, String color, LocalDate buyingDate, double pricePerDay, String fuelType,
            int fuelConsumption, boolean integratedGPS, int seats) {
        super(brand, model, color, buyingDate, pricePerDay, fuelType, fuelConsumption, integratedGPS);
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car [seats=" + seats + "]";
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
