import Model.Driver;
import Service.RideService;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RideService rideService = new RideService();
        rideService.addUser("u1","abc", 0, 0);
        rideService.addDriver("d1","abcd", 2, 3, "car", 5);
        rideService.addUser("u3","abcde", 0, 0);
        rideService.addDriver("d2","abcdef", 6, 7, "car1", 6);

        List<Driver> availableDrivers = rideService.findRide("u1");
        System.out.println("Available drivers - ");
        for(Driver d:availableDrivers){
            System.out.println(d.getName() + " - " + d.vehicle.getVehicleType());
        }
        RideService.chooseRide("u1","d1");
        System.out.println("Total earnings of d1 : " + RideService.findTotalEarning("d1"));



    }
}