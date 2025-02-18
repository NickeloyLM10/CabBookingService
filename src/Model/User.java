package Model;

public class User {
    public String userId;
    String name;
    public Location location;

    public User(String userId, String name, double x, double y) {
        this.userId = userId;
        this.name = name;
        this.location = new Location(x, y);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void updateLocation(double x, double y) {
        this.location = new Location(x, y);
    }
}
