class Vehicle{
    String ownerId;
    String vehicleId;
    String type;
    String model;
    String location;
    String photo;
    boolean availability;
    double priceperday;
    public vehicle(String vehicleId, String ownerId, String type, String model, 
                   String location, String photo, boolean availability, double priceperday){
        this.vehicleId=vehicleId;
        this.ownerId=ownerId;
        this.type=type;
        this.model=model;
        this.location=location;
        this.photo=photo;
        this.availability=availability;
        this.priceperday=priceperday;
    }
    public void markAvailable(){
        availability=true;
        System.out.println("Vehicle "+vehicleId+"is Available");
    }
    public void markUnavailable(){
        availability=false;
        System.out.println("Vehicle "+vehicleId+" is  not Available");
    }
    public void displaydetails(){
        System.out.println("VehicleID: " + vehicleId + ", Model: " + model +", Location: " + location + ", Available: " + availability +", Price/Day: " + pricePerDay);
    }
}




