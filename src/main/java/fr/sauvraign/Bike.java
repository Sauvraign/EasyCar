package fr.sauvraign;

import java.time.LocalDate;

public class Bike extends Vehicle{
    private char size;

    public Bike(String brand, String model, String color, LocalDate buyingDate, double pricePerDay, char size) {
        super(brand, model, color, buyingDate, pricePerDay);
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bike [size=" + size + "]";
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
}
