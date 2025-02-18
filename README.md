# Ride Sharing Service

This project is a simple ride-sharing service implemented in Java. It allows users to book rides with available drivers, update locations, and track earnings for drivers.

## Features
- Add users and drivers with their respective locations.
- Update user and driver locations.
- Find nearby drivers within a distance of 5 units.
- Book a ride with an available driver.
- Track total earnings for a driver.

## Technologies Used
- Java

## Project Structure
```
├── src
│   ├── Model
│   │   ├── User.java
│   │   ├── Driver.java
│   │   ├── Vehicle.java
│   │   ├── Location.java
│   ├── Service
│   │   ├── RideService.java
│   ├── Main.java
├── README.md
```

## Installation & Setup
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/ridesharing-service.git
   ```
2. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse, VS Code).
3. Run the `Main.java` file to start the application.

## Usage
### 1. Adding Users & Drivers
```java
rideService.addUser("u1", "Alice", 0, 0);
rideService.addDriver("d1", "Bob", 2, 3, "Car", 4);
```
### 2. Finding Nearby Drivers
```java
List<Driver> availableDrivers = rideService.findRide("u1");
```
### 3. Choosing a Ride
```java
RideService.chooseRide("u1", "d1");
```
### 4. Checking Driver's Earnings
```java
System.out.println("Total earnings of d1: " + RideService.findTotalEarning("d1"));
```

## Future Enhancements
- Implement real-time ride tracking.
- Support ride cancellations.
- Add multiple vehicle types and pricing models.

## Contributing
Pull requests are welcome. Please open an issue first to discuss any major changes.

## License
This project is open-source and available under the [MIT License](LICENSE).

