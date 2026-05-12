public class Car {
    int year;
    String brand;
    double price;

    public Car() {
        year = 2000;
        brand = "Unknown";
        price = 0.00;
    }

    public void displayInfo() {
        System.out.println("Year: " + year);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
	
    public static void main(String[] args) {
        Car car1 = new Car();
		
        car1.displayInfo();
    }
}