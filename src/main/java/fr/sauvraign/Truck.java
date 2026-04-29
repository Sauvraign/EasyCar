package fr.sauvraign;

import java.time.LocalDate;

public class Truck extends MotorizedVehicle {
    private double cargoCapacity;

    public Truck(String brand, String model, String color, LocalDate buyingDate, double pricePerDay, String fuelType,
            int fuelConsumption, boolean integratedGPS, double cargoCapacity) {
        super(brand, model, color, buyingDate, pricePerDay, fuelType, fuelConsumption, integratedGPS);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "Truck [cargoCapacity=" + cargoCapacity + "]";
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
