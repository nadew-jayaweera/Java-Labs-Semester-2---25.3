import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {

        Scanner getNum = new Scanner(System.in);
        int num;
        int sum = 0;

        do {
            System.out.print("Enter a number: ");
            num = getNum.nextInt();

            if (num > 0) {
                sum++;
            }

        } while (num > 0);

        System.out.println("Positive numbers recorded: " + sum);
    }
}