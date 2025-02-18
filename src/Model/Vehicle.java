package Model;

public class Vehicle {
    String vehicleType;
    int numberofSeats;

    public Vehicle(String vehicleType, int numberofSeats) {
        this.vehicleType = vehicleType;
        this.numberofSeats = numberofSeats;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}
