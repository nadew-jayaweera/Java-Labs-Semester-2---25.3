package Q4;

public class Main {
    public static void main(String[] args) {
        Vehicle v[] = new Vehicle[4];

        v[0] = new Vehicle();
        v[1] = new Car();
        v[2] = new Motorcycle();
        v[3] = new Truck();

        for (Vehicle vehicle : v) {
            vehicle.startEngine();
        }


    }
}
