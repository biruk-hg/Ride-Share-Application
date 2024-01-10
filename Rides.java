public class Rides {
    // Private fields to store ride information
    private int driverID;
    private int riderID;
    private double fare;

    // Constructor to initialize ride attributes
    public Rides(int driverID, int riderID, double fare) {
        this.driverID = driverID;
        this.riderID = riderID;
        this.fare = fare;
    }

    // Getter and setter methods for each ride attribute
    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public int getRiderID() {
        return riderID;
    }

    public void setRiderID(int riderID) {
        this.riderID = riderID;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }
}
