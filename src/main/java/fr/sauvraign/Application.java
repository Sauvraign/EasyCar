package fr.sauvraign;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Application {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Citroën", "C5", "Rouge", LocalDate.of(2026, 4, 28), 25.00);
        Vehicle vehicle2 = new Vehicle("Peugeot", "405", "Grise", LocalDate.of(2026, 6, 1), 18.00);
        Customer customer1 = new Customer("Kevin", "LABAT", "57 rue Garès", "Brocas", "40420");
        Customer customer2 = new Customer("Enzo", "MARTINEZ", "31 rue des Tulipes", "Hagetmau", "40119");
        ArrayList<Booking> bookings = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Kevin", "LABAT", "57 rue Garès", "Brocas", "40420"));
        customers.add(new Customer("Enzo", "MARTINEZ", "31 rue des Tulipes", "Hagetmau", "40119"));
        customers.add(new Customer("Josua", "MARTINEZ", "31 rue des Tulipes", "Hagetmau", "40119"));
        Booking booking = new Booking(LocalDate.of(2026, 5, 10), LocalDate.of(2026, 5, 28), true, vehicle1, customers.get(1));
        Booking booking2 = new Booking(LocalDate.of(2026, 6, 1), LocalDate.of(2026, 6, 30), true, vehicle2, customers.get(0));
        double totalPrice = booking.totalPrice();
        double totalPrice2 = booking2.totalPrice();
        // System.out.println(booking);
        // System.out.println(booking2);
        // System.out.println(bookings);
        // System.out.println(totalPrice);
        // System.out.println(totalPrice2);
        System.out.println(customers.get(0).totalMoneySpent());
        System.out.println(customers.get(1).totalMoneySpent());
        Collections.sort(customers);
        System.out.println(customers.get(0).totalMoneySpent());
        System.out.println(customers.get(1).totalMoneySpent());
        System.out.println(customers.get(2).totalMoneySpent());
    }
}
