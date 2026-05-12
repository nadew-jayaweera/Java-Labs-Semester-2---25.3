import java.util.Scanner;
public class Q5 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		
		if (num%2 == 0) {
			System.out.println("Number is even");
		}else if (num%2 == 1) {
			System.out.println("Number is odd");
		}
		sc.close();
	}
}