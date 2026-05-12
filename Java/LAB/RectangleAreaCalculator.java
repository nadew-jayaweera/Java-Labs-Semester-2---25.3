public class RectangleAreaCalculator {
    private double length ,width;
    RectangleAreaCalculator(double length ,double width){
        this.length = length;
        this.width = width;


    }
    double calculateArea(){
        return length*width;
    }
    public static void main(String[] args){
        RectangleAreaCalculator rectangle1 = new RectangleAreaCalculator(5.0, 3.0);
        System.out.println("Area of the rectangle: " + rectangle1.calculateArea());
    }
}
