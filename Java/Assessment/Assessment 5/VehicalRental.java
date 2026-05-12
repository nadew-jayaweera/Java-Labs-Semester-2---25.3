class VehicleRental {
    int vehicleId;
    String vehicleType;
    double ratePerDay;
    double availableKm;
    boolean isAvailable;

    VehicleRental() {
        vehicleId = 0;
        vehicleType = "Car";
        ratePerDay = 5000.0;
        availableKm = 300.0;
        isAvailable = true;
    }

    VehicleRental(int vehicleId, String vehicleType,
                  double ratePerDay, double availableKm,
                  boolean isAvailable) {

        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.ratePerDay = ratePerDay;
        this.availableKm = availableKm;
        this.isAvailable = isAvailable;
    }

    String rentVehicle(int days, double estimatedKm) {
        if (!isAvailable) {
            return "Vehicle is currently unavailable.";
        }

        if (estimatedKm > availableKm) {
            return "Requested kilometers exceed available kilometers.";
        }

        isAvailable = false;
        double totalCost = ratePerDay * days;

        return "Vehicle rented successfully.\n" + "Total Cost: Rs. " + totalCost;
    }

    void returnVehicle(double kmUsed) {
        availableKm -= kmUsed;
        isAvailable = true;

        System.out.println("Vehicle returned successfully.");
        System.out.println("Remaining Available KM: " + availableKm);
        System.out.println("Vehicle is now available.");
    }

    String getVehicleInfo() {

        return "Vehicle ID: " + vehicleId +
               "\nVehicle Type: " + vehicleType +
               "\nRate Per Day: Rs. " + ratePerDay +
               "\nAvailable KM: " + availableKm +
               "\nAvailable Status: " + isAvailable;
    }

    public static void main(String[] args) {
        VehicleRental vehicle1 = new VehicleRental();

        VehicleRental vehicle2 = new VehicleRental(101, "Van", 8000.0, 500.0, true);

        System.out.println("----- Vehicle 1 Info -----");
        System.out.println(vehicle1.getVehicleInfo());

        System.out.println("\n----- Vehicle 2 Info -----");
        System.out.println(vehicle2.getVehicleInfo());

        System.out.println("\n--- Renting Vehicle 2 ---");
        System.out.println(vehicle2.rentVehicle(3, 200));

        System.out.println("\nVehicle Info After Renting:");
        System.out.println(vehicle2.getVehicleInfo());

        System.out.println("\n--- Trying to Rent Again ---");
        System.out.println(vehicle2.rentVehicle(2, 100));

        System.out.println("\n--- Returning Vehicle ---");
        vehicle2.returnVehicle(150);

        System.out.println("\nVehicle Info After Return:");
        System.out.println(vehicle2.getVehicleInfo());

        System.out.println("\n--- Renting Again ---");
        System.out.println(vehicle2.rentVehicle(2, 100));

        System.out.println("\nFinal Vehicle Info:");
        System.out.println(vehicle2.getVehicleInfo());
    }
}