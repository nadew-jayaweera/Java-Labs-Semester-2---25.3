import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks for Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int m3 = sc.nextInt();

        // Calculations
        int total = m1 + m2 + m3;
        double average = total / 3.0;
        double percentage = (total / 300.0) * 100;

        // Display results
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
        System.out.println("Percentage = " + percentage + "%");

        // Grade calculation
        if (percentage >= 75) {
            System.out.println("Grade: Distinction");
        } else if (percentage >= 60) {
            System.out.println("Grade: Credit");
        } else if (percentage >= 50) {
            System.out.println("Grade: Pass");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}