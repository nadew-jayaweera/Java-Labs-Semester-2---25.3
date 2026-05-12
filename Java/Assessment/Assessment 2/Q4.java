import java.util.Scanner;
public class Q4 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		
		if (num>0) {
			System.out.println("Number is positive.");
		}else {
			System.out.println("Number is negative");
		}
	}
}