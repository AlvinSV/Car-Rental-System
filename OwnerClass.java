import java.util.ArrayList;
class Owner extends User{
    ArrayList<Vehicle> vehiclelist;
    public Owner(String userId,String name,String email){
        super(userId,name,email);
        this.vehiclelist= new ArrayList<>();
    }
    public void addVehicle(Vehicle v){
        vehiclelist.add(v);
        System.out.println("Vehicle Added : "+v);
    }
    public void editVehicle(String vehicleId,String newmodel,String newstatus){
        for(Vehicle v:vehiclelist){
            if(v.vehicleId.equals(vehicleId)){
                v.model=newmodel;
                v.status=newstatus;
                System.out.println("Vehicle Updated: "+v);
                return;
            }
        }
        System.out.println("Vehicle not found");
    }
    public void viewBookings(){
        System.out.println("Showing all bookings for Owner: "+name);
    }
    public void approveBookings(String bookingId){
        System.out.println("Booking "+bookingId+"Approved by owner: "+name);
    }
    public void checkVehicleCondition(String vehicleId){
        for(Vehicle v:vehiclelist){
            if(v.vehicleId.equals(vehicleId)){
                System.out.println("Condition report for vehicle "+v);
                return;
            }
        }
        System.out.println("Vehicle not found");
    }
}





