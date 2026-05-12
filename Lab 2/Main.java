import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first Mark");
        int q1 = scanner.nextInt();
        System.out.println("Enter the second Mark");
        System.out.println("Enter the second Mark");
        System.out.println("Enter the fourth Mark");
        int q1 = scanner.nextInt();
        int q2 = scanner.nextInt();
        int q3 = scanner.nextInt();
        int q4 = scanner.nextInt();
        int total = q1 + q2 + q3 + q4;
        double average = total / 4.0;
        if(total >= 80){
            System.out.println('A');
        }
        else if(total >= 65){
            System.out.println('B');
        }
        else if (total >= 50){
            System.out.println('C');
        }
        else if(total < 50){
            System.out.println('F');
        }
        else{
            System.out.println("Invalid Marks");
 
 
        scanner.close();
        }
 
    }
}