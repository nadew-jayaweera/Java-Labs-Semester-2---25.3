
import java.util.Scanner;
public class question04 {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num01 = num.nextInt();
        boolean yes = false;

        if (num01 % 5 == 0) {
            yes = true;
        }
        System.out.println("Is the number a multiple of 5: "+ yes);
    }
}
