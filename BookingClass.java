class Booking {
    String bookingId;
    String vehicleId;
    String customerId;
    String ownerId;
    String startDate;
    String endDate;
    String pickupLocation;
    String returnLocation;
    String status;

    public Booking(String bookingId, String vehicleId, String customerId, String ownerId,
                   String startDate, String endDate, String pickupLocation, String returnLocation, String status) {
        this.bookingId = bookingId;
        this.vehicleId = vehicleId;
        this.customerId = customerId;
        this.ownerId = ownerId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pickupLocation = pickupLocation;
        this.returnLocation = returnLocation;
        this.status = status;
    }

    public void confirmBooking() {
        if ("Pending".equalsIgnoreCase(this.status)) {
            this.status = "Confirmed";
            System.out.println("Booking " + bookingId + " confirmed.");
        } else {
            System.out.println("Cannot confirm booking. Current status: " + this.status);
        }
    }

    public void completeBooking() {
        if ("Confirmed".equalsIgnoreCase(this.status)) {
            this.status = "Completed";
            System.out.println("Booking " + bookingId + " completed.");
        } else {
            System.out.println("Cannot complete booking. Current status: " + this.status);
        }
    }

    public void raiseDispute() {
        if ("Completed".equalsIgnoreCase(this.status)) {
            this.status = "Dispute";
            System.out.println("Dispute raised for booking " + bookingId + ".");
        } else {
            System.out.println("Can only raise a dispute for a completed booking. Current status: " + this.status);
        }
    }

    public void viewBookingDetails() {
        System.out.println("Booking ID: " + bookingId + ", Vehicle ID: " + vehicleId +
                           ", Customer ID: " + customerId + ", Owner ID: " + ownerId +
                           ", From: " + startDate + " To: " + endDate +
                           ", Pickup: " + pickupLocation + ", Return: " + returnLocation +
                           ", Status: " + status);
    }
}
