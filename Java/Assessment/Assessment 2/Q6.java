import java.util.Scanner;

public class question06 {
    public static void main(String[] args) {

        Scanner h = new Scanner(System.in);
        System.out.print("Enter height(m): ");
        float height = h.nextFloat();

        Scanner w = new Scanner(System.in);
        System.out.print("Enter weight(kg): ");
        float weight = w.nextFloat();

        String result = "none";
        float bmi;
        bmi = weight / (height * height);

        if (bmi < 18.5) {
            result = "Underweight";
        } else if (bmi < 24.9) {
            result = "Normal";
        } else if (bmi < 29.9) {
            result = "Overweight";
        } else {
            result = "Obese";
        }

        System.out.println("Your BMI is: " + bmi + ", And you are " + result);
    }
}