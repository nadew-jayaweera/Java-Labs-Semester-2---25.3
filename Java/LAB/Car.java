public class Car {
    String make,model;
    int year;
    Car(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    void displayInfo(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }


    public static void main(String[] args){
        Car car1 = new Car("Toyota","Camry",2020);
        car1.displayInfo();
    }

}