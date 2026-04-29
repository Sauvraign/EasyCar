package fr.sauvraign;

import java.time.LocalDate;

public class MotorizedVehicle extends Vehicle {
    private String fuelType;
    private int fuelConsumption;
	private boolean integratedGPS;

    public MotorizedVehicle(String brand, String model, String color, LocalDate buyingDate, double pricePerDay, String fuelType, int fuelConsumption, boolean integratedGPS) {
        super(brand, model, color, buyingDate, pricePerDay);
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
        this.integratedGPS = integratedGPS;
    }

    @Override
    public String toString() {
        return "MotorizedVehicle [fuelType=" + fuelType + ", fuelConsumption=" + fuelConsumption + ", integratedGPS="
                + integratedGPS + "]";
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public boolean isIntegratedGPS() {
        return integratedGPS;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setIntegratedGPS(boolean integratedGPS) {
        this.integratedGPS = integratedGPS;
    }
}