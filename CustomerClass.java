import java.util.ArrayList;

class Customer extends User {
    ArrayList<Booking> bookingHistory;

    public Customer(String userId, String name, String email, String phone, String password, String userType) {
        super(userId, name, email, phone, password, userType);
        this.bookingHistory = new ArrayList<>();
    }

    public void searchVehicle() {
        System.out.println(getName() + " is searching for available vehicles...");
    }

    public void filterVehicles(String filterType) {
        System.out.println(getName() + " is filtering vehicles by: " + filterType);
    }

    public void bookVehicle(Vehicle v) {
        Booking booking = new Booking("B" + (bookingHistory.size() + 1),
                                      v.vehicleId, this.getUserId(), v.ownerId,
                                      "2025-09-04", "2025-09-05",
                                      v.location, v.location, "Pending");
        bookingHistory.add(booking);
        System.out.println("Vehicle " + v.vehicleId + " booked by " + getName());
    }

    public void uploadReturnPhoto(String bookingId, String photoPath) {
        System.out.println("Customer " + getName() + " uploaded return photo for booking " + bookingId + ": " + photoPath);
    }

    public void viewBookingHistory() {
        System.out.println("Booking History for " + getName() + ":");
        for (Booking b : bookingHistory) {
            System.out.println("- Booking ID: " + b.bookingId + ", Vehicle ID: " + b.vehicleId + ", Status: " + b.status);
        }
    }
}
