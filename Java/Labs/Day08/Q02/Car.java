package Q02;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(int vehicleID, String brand, double speed, int numberOfDoors) {
        super(vehicleID, brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() { return numberOfDoors; }
    public void setNumberOfDoors(int numberOfDoors) { this.numberOfDoors = numberOfDoors; }

    @Override
    public double calculateSpeed() {
        System.out.println("Calculating top speed for a " + numberOfDoors + "-door " + getBrand() + " car...");
        return getSpeed() * 1.1;
    }
}
