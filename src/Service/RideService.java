package Service;

import Model.Driver;
import Model.Location;
import Model.User;

import java.util.ArrayList;
import java.util.List;

public class RideService {
    List<User> users = new ArrayList<>();
    static List<Driver> drivers = new ArrayList<>();

    public void addUser(String userId, String name, double x, double y){
        users.add(new User(userId, name, x, y));
    }
    public void addDriver(String driverId, String name, double x, double y, String vehicleType, int numberofSeats){
        drivers.add(new Driver(driverId, name, x, y, vehicleType, numberofSeats));
    }
    public void updateUserLocation(String userId, double x, double y){
        for(User user:users){
            if(user.userId.equals(userId)){
                user.updateLocation(x,y);
                break;
            }
        }
    }
    public void updateUser(String userId, String name){
        for(User user:users){
            if(user.userId.equals(userId)){
                user.setName(name);
                break;
            }
        }
    }

    public void updateDriverLocation(String driverId, boolean available){
        for( Driver driver:drivers){
            if(!driver.driverId.equals(driverId)){
                driver.changeStatus(available);
                break;
            }
        }
    }
    public List<Driver> findRide(String userId){
        User user = null;
        for(User curr:users){
            if(curr.userId.equals(userId)){
                user = curr;
                break;
            }
        }
        if(user == null) return new ArrayList<>();
        List<Driver> nearByDrivers = new ArrayList<>();
        for(Driver driver:drivers){
            if(driver.isAvailable && distance(user.location, driver.location)<=5){
                nearByDrivers.add(driver);
            }
        }
        return nearByDrivers;
    }

    public static void chooseRide(String userId, String driverId){
        Driver driver = null;
        for(Driver d:drivers){
            if(d.driverId.equals(driverId) && d.isAvailable){
                driver = d;
                break;
            }
        }
        if(driver != null){
            driver.changeStatus(false);
            driver.addEarnings(100.0);
            System.out.println("Ride confirmed with driver: " + driver.getName() + ", vehicle: " + driver.vehicle.getVehicleType());
        } else {
            System.out.println("No availaable drivers");
        }
    }

    public static double findTotalEarning(String driverId){
        for(Driver driver : drivers){
            if(driver.driverId.equals(driverId)){
                return driver.totalEarning;
            }
        }
        return 0.0;
    }
    private double distance(Location loc1, Location loc2){
        return Math.sqrt(Math.pow(loc2.x - loc1.x , 2) + Math.pow(loc2.y - loc1.y , 2));
    }


}
