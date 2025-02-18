package Model;

public class Driver {
    public String driverId;
    String name;
    public Location location;
    public boolean isAvailable;
    public double totalEarning;
    public Vehicle vehicle;

    public Driver(String driverId, String name, double x, double y,String vehicleType, int numberofSeats) {
        this.driverId = driverId;
        this.name = name;
        this.location = new Location(x,y);
        this.isAvailable = true;
        this.totalEarning = 0.0;
        this.vehicle = new Vehicle(vehicleType , numberofSeats);
    }

    public String getName() {
        return name;
    }

    public void updateLocation(double x, double y){
        this.location = new Location(x,y);
    }
    public void changeStatus(boolean available){
        this.isAvailable = available;
    }
    public void addEarnings(double amount){
        this.totalEarning += amount;
    }
}
