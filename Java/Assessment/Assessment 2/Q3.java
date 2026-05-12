import java.util.Scanner;

public class Q3 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int  num = sc.nextInt();
		
		if (num % 3 == 0 && num % 5 == 0){
			System.out.println("Divisable by both 5 and 3");
		}else if (num % 3 == 0 || num % 5 == 0) {
			System.out.println("Divisable by either 3 or 5");
		}else {
			System.out.println("Both cannot divide by 3 or 5");
		}
		sc.close();
	}
}
