import java.util.Scanner;

public class question07 {
    public static void main(String[] args) {

        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter number 01: ");
        double num01 = num1.nextDouble();

        Scanner num2 = new Scanner(System.in);
        System.out.print("Enter number 02: ");
        double num02 = num2.nextDouble();

        Scanner getSign = new Scanner(System.in);
        System.out.println("Select operation {-} {+} {/} {*} {%}");
        String sign = getSign.nextLine();

        switch (sign) {
            case "+":
                System.out.println(num01 + num02);
                break;
            case "-":
                System.out.println(num01 - num02);
                break;
            case "*":
                System.out.println(num01 * num02);
                break;
            case "/":
                System.out.println(num01 / num02);
                break;
            case "%":
                System.out.println(num01 % num02);
                break;
        }
    }
}