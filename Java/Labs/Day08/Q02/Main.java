package Q02;

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Car(701, "Ford", 120.0, 4);
        double modernSpeed = myVehicle.calculateSpeed();
        System.out.println("Resulting Speed: " + modernSpeed + " km/h");
    }
}
