class Animal {
	String type;
	
	void catType() {
		type = "Cat";
		System.out.println("Animal type: "+type);
	}
	
	void dogType() {
		type = "Dog";
		System.out.println("Animal type: "+type);
	}
}

public class main {
	public static void main(String[] arg) {
		Animal an = new Animal();
		
		an.catType();
		an.dogType();
	}
}