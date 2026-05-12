import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 10000;
        double minBalance = 500;

        System.out.println("Welcome to the ATM!");
        System.out.println("Initial Balance: " + balance);

        do {
            if (balance < minBalance) {
                System.out.println("Not enough funds to continue. Final Balance: " + balance);
                break;
            }

            System.out.println("Options: 1. Withdraw  2. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 2) {
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            }

            if (choice == 1) {
                System.out.print("Enter amount to withdraw: ");
                double amount = sc.nextDouble();

                if (amount > balance) {
                    System.out.println("Error: You cannot withdraw more than your balance.");
                    continue;
                }

                balance -= amount;
                System.out.println("Withdrawal successful! Remaining Balance: " + balance);
            } else {
                System.out.println("Invalid choice. Try again.");
            }

        } while (true);
    }
}