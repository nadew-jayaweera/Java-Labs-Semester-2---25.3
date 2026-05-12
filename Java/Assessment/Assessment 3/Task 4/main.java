class laptop{
	String brand = "Asus";
	
	void method1(){
		System.out.println("Method 1: "+ brand);
	}
	
	void method2() {
		System.out.println("Method 2: "+ brand);
	}
}

public class main {
	public static void main(String[] arg) {
		laptop lap = new laptop();
		
		lap.method1();
		lap.method2();
	}
}