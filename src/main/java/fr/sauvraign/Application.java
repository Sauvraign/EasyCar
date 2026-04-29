package fr.sauvraign;

import java.time.LocalDate;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Citroën", "C5", "Rouge", LocalDate.of(2026, 4, 28), 25.00);
        Customer customer1 = new Customer("Kevin", "LABAT", "57 rue Garès", "Brocas", "40420");
        Booking booking = new Booking(LocalDate.of(2026, 5, 10),
                                    LocalDate.of(2026, 5, 28),
                                    true,
                                    vehicle1,
                                    customer1);
        ArrayList<Booking> bookings = new ArrayList<>();
        System.out.println(booking);
        System.out.println(bookings);
    }
}
