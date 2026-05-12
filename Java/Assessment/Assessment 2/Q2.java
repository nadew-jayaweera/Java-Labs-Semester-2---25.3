public class Q2 {
	public static void main(String[] arg){
		int x = 5;
		int y = ++x + x++ + --x + x--;
		System.out.println("x = " + x + ", y = " + y);
	}
}