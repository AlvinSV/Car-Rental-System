import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Booking {
    private String bookingId;
    private String vehicleId;
    private String customerId; 
    private String ownerId; 
    private Date startDate;
    private Date endDate;
    private String pickupLocation;
    private String returnLocation;
    private String status;

    public Booking(String bookingId, String vehicleId, String customerId, String ownerId,
                   Date startDate, Date endDate, String pickupLocation, String returnLocation) {
        this.bookingId = bookingId;
        this.vehicleId = vehicleId;
        this.customerId = customerId;
        this.ownerId = ownerId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pickupLocation = pickupLocation;
        this.returnLocation = returnLocation;
        this.status = "PENDING";
    }

    public void confirmBooking() {
        if ("PENDING".equals(this.status)) {
            this.status = "CONFIRMED";
            System.out.println("Booking " + bookingId + " confirmed.");
        } else {
            System.out.println("Cannot confirm booking. Current status: " + this.status);
        }
    }

    public void completeBooking() {
        if ("CONFIRMED".equals(this.status)) {
            this.status = "COMPLETED";
            System.out.println("Booking " + bookingId + " completed.");
        } else {
            System.out.println("Cannot complete booking. Current status: " + this.status);
        }
    }

    public void raiseDispute() {
        if ("COMPLETED".equals(this.status)) {
            this.status = "DISPUTE";
            System.out.println("Dispute raised for booking " + bookingId + ".");
        } else {
            System.out.println("Can only raise a dispute for a completed booking. Current status: " + this.status);
        }
    }

    public String getBookingId() { return bookingId; }
    public String getVehicleId() { return vehicleId; }
    public String getCustomerId() { return customerId; }
    public String getOwnerId() { return ownerId; }
    public String getStatus() { return status; }
    public Date getStartDate() { return startDate; }
    public Date getEndDate() { return endDate; }
   
}