package vehicleManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample owner and customer
        Owner owner = new Owner("O1", "Rahul", "rahul@example.com");
        Customer customer = new Customer("C1", "Meera", "meera@example.com", "9876543210", "pass123", "Customer");

        // Add 2 default vehicles
        Vehicle v1 = new Vehicle("V1", "O1", "Car", "Swift", "Kochi", "car1.jpg", true, 1500);
        Vehicle v2 = new Vehicle("V2", "O1", "Bike", "Yamaha", "Kochi", "bike1.jpg", true, 600);
        owner.addVehicle(v1);
        owner.addVehicle(v2);

        boolean exit = false;
        while (!exit) {
            System.out.println("\n=== Vehicle Rental Management ===");
            System.out.println("1. View Available Vehicles");
            System.out.println("2. Add New Vehicle (Owner)");
            System.out.println("3. Customer Book Vehicle");
            System.out.println("4. View Customer Booking History");
            System.out.println("5. Confirm Booking (Owner)");
            System.out.println("6. Complete Booking");
            System.out.println("7. Raise Dispute");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("=== Available Vehicles ===");
                    for (Vehicle v : owner.vehiclelist) {
                        v.displaydetails();
                    }
                    break;

                case 2:
                    System.out.print("Enter Vehicle ID: ");
                    String vehicleId = sc.nextLine();

                    System.out.print("Enter Type (Car/Bike): ");
                    String type = sc.nextLine();

                    System.out.print("Enter Model: ");
                    String model = sc.nextLine();

                    System.out.print("Enter Location: ");
                    String location = sc.nextLine();

                    System.out.print("Enter Photo filename: ");
                    String photo = sc.nextLine();

                    System.out.print("Enter Price per Day: ");
                    double price = sc.nextDouble();
                    sc.nextLine(); // consume newline

                    Vehicle newVehicle = new Vehicle(vehicleId, owner.getUserId(), type, model, location, photo, true, price);
                    owner.addVehicle(newVehicle);
                    break;

                case 3:
                    if (!owner.vehiclelist.isEmpty()) {
                        System.out.print("Enter Vehicle ID to book: ");
                        String bookId = sc.nextLine();
                        Vehicle selected = null;
                        for (Vehicle v : owner.vehiclelist) {
                            if (v.vehicleId.equals(bookId) && v.availability) {
                                selected = v;
                                break;
                            }
                        }
                        if (selected != null) {
                            customer.bookVehicle(selected);
                            selected.markUnavailable();
                        } else {
                            System.out.println("Vehicle not found or unavailable.");
                        }
                    } else {
                        System.out.println("No vehicles available for booking.");
                    }
                    break;

                case 4:
                    customer.viewBookingHistory();
                    break;

                case 5:
                    if (!customer.bookingHistory.isEmpty()) {
                        Booking b = customer.bookingHistory.get(0);
                        b.confirmBooking();
                    } else {
                        System.out.println("No bookings to confirm.");
                    }
                    break;

                case 6:
                    if (!customer.bookingHistory.isEmpty()) {
                        Booking b = customer.bookingHistory.get(0);
                        b.completeBooking();
                    } else {
                        System.out.println("No bookings to complete.");
                    }
                    break;

                case 7:
                    if (!customer.bookingHistory.isEmpty()) {
                        Booking b = customer.bookingHistory.get(0);
                        b.raiseDispute();
                    } else {
                        System.out.println("No bookings to raise dispute.");
                    }
                    break;

                case 8:
                    exit = true;
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }
}
