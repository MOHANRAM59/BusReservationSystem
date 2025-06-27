package main;

import model.Bus;
import service.ReservationSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReservationSystem system = new ReservationSystem();
        Scanner scanner = new Scanner(System.in);

        // Add sample buses
        system.addBus(new Bus(101, true, 2));
        system.addBus(new Bus(102, false, 3));

        while (true) {
            System.out.println("\n--- Bus Reservation System ---");
            System.out.println("1. Show Buses");
            System.out.println("2. Book Ticket");
            System.out.println("3. Show Bookings");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    system.showAvailableBuses();
                    break;
                case 2:
                    system.bookTicket();
                    break;
                case 3:
                    system.showBookings();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
