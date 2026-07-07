public class question02 {
    public static void main(String[] args) {
        int x = 7;
        int y;
        y = x++ + ++x + --x + x-- ;
        System.out.println("x = " + x + ", y = " + y);
    }
}
