import java.util.Scanner;

public class question01 {
    public static void main(String[] args) {
        Scanner getNum01 = new Scanner(System.in);
        System.out.print("Enter Mark: ");
        int num01 = getNum01.nextInt();

        Scanner getNum02 = new Scanner(System.in);
        System.out.print("Enter Mark: ");
        int num02 = getNum02.nextInt();

        Scanner getNum03 = new Scanner(System.in);
        System.out.print("Enter Mark: ");
        int num03 = getNum03.nextInt();
        
        Scanner getNum04 = new Scanner(System.in);
        System.out.print("Enter Mark: ");
        int num04 = getNum04.nextInt();

        char grade = 'F';
        int average, total;
        total = num01 + num02 + num03 + num04;        
        average = total / 4;

        if (average >= 80) {
            grade = 'A';
        } else if(average >= 65) {
            grade = 'B';
        } else if(average >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Grade is: " + grade);


        
    


    }
}
