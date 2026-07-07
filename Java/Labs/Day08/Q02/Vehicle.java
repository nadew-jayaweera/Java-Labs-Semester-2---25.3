package Q02;

public class Vehicle {
    private int vehicleID;
    private String brand;
    private double speed;

    public Vehicle(int vehicleID, String brand, double speed) {
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.speed = speed;
    }

    public int getVehicleID() { return vehicleID; }
    public void setVehicleID(int vehicleID) { this.vehicleID = vehicleID; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public double getSpeed() { return speed; }
    public void setSpeed(double speed) { this.speed = speed; }

    public double calculateSpeed() {
        return this.speed;
    }
}