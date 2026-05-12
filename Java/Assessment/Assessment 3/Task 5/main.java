class Mobile {
	String model = "Samsung";
	
	void displayModel(){
		System.out.println("Mobile model: "+model);
	}
}

public class main{
	public static void main(String[] arg) {
		Mobile mobile = new Mobile();
		
		mobile.displayModel();
	}
}