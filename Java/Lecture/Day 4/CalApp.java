class CalApp {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        // call all methods
        c1.printMag();  

        // non-param - return
        int sum = c1.addNumbers();
        System.out.println("Sum is: " + sum);

        // param - non return
        c1.subNumber(20, 10);

        // param - return
        int mul = c1.multiplyNumber(50, 3);
        System.out.println("Multiplication is: " + mul);
    }
}