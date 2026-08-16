package track.PracticeSession;

import java.util.Scanner;

class Booking {
    String passengerName;
    String cabType;
    int distance;
    int fare;

    Booking(String passengerName) {
        this.passengerName = passengerName;
        this.cabType = "Mini";
        this.distance = 5;
        this.fare = 75;
    }

    Booking(String passengerName, String cabType, int distance) {
        this.passengerName = passengerName;
        this.cabType = cabType;
        this.distance = distance;
        this.fare = distance * 15;
    }

    void displayBooking() {
        System.out.println("Passenger: " + passengerName);
        System.out.println("Cab Type: " + cabType);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: Rs. " + fare);
    }
}

public class CabBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        String passengerName = sc.next();

        Booking cabBooking = null;

        if (choice == 1) {
            cabBooking = new Booking(passengerName);
        } else if (choice == 2) {
            String cabType = sc.next();
            int distance = sc.nextInt();

            cabBooking = new Booking(passengerName, cabType, distance);
        }

        cabBooking.displayBooking();
        sc.close();
    }
}
