package service;

import model.Bus;
import model.Booking;
import java.util.ArrayList;
import java.util.Scanner;

public class ReservationSystem {
    private ArrayList<Bus> buses = new ArrayList<>();
    private ArrayList<Booking> bookings = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addBus(Bus bus) {
        buses.add(bus);
    }

    public void showAvailableBuses() {
        for (Bus b : buses) {
            b.displayBusInfo();
        }
    }

    public void bookTicket() {
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter bus number: ");
        int busNo = scanner.nextInt();

        Bus selectedBus = null;
        for (Bus b : buses) {
            if (b.getBusNo() == busNo) {
                selectedBus = b;
                break;
            }
        }

        if (selectedBus == null) {
            System.out.println("Bus not found.");
            return;
        }

        // Count bookings on this bus
        long bookedCount = bookings.stream().filter(b -> b.getBusNo() == busNo).count();
        if (bookedCount >= selectedBus.getCapacity()) {
            System.out.println("Sorry, no seats available.");
        } else {
            bookings.add(new Booking(name, busNo));
            System.out.println("Booking successful!");
        }
    }

    public void showBookings() {
        for (Booking b : bookings) {
            System.out.println("Name: " + b.getPassengerName() + " | Bus No: " + b.getBusNo());
        }
    }
}
