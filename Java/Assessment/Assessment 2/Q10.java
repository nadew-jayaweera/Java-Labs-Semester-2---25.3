public class question10 {
    public static void main(String[] args) {

        int i = 2;
        int sum = 0;

        while (i <= 100) {
            sum += i;
            i += 2;
        }

        System.out.println("Sum of numbers from 1-100: " + sum);
    }
}