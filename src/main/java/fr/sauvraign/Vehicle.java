package fr.sauvraign;

import java.time.LocalDate;

public class Vehicle {
    private String brand;
    private String model;
	private String color;
    private LocalDate buyingDate;
	private double pricePerDay;

    public Vehicle(String brand, String model, String color, LocalDate buyingDate, double pricePerDay) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.buyingDate = buyingDate;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return "Vehicle [brand=" + brand + ", model=" + model + ", color=" + color + ", buyingDate=" + buyingDate
                + ", pricePerDay=" + pricePerDay + "]";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getBuyingDate() {
        return buyingDate;
    }

    public void setBuyingDate(LocalDate buyingDate) {
        this.buyingDate = buyingDate;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}