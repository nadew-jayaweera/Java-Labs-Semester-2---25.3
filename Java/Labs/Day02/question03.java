import java.util.Scanner;

public class question03 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num01 = num.nextInt();

        boolean divisibleby2 = false, divisibleby7 = false, result = false;


        if (num01 % 2 == 0) {
            divisibleby2 = true;
        }
        if (num01 % 7 == 0) {
            divisibleby7 = true;
        }

        if (divisibleby7 == divisibleby2) {
            result = true;
        }
        System.out.println("Is the number divisible by 5:"+ divisibleby2);
        System.out.println("Is the number divisible by 7:"+ divisibleby7);
        System.out.println("Is the number divisible by both 2 & 7:" + result);

    }
        
}

