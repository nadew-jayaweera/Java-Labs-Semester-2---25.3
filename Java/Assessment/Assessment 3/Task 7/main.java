class Person {
	private int age;
	
	void setAge(int a) {
		age = a;
	}
	
	int getAge() {
		return age;
	}
	
	void displayAge() {
		System.out.println("Age: "+ age);
	}
}

public class main {
	public static void main(String[] arg) {
		Person p = new Person();
		
		p.setAge(25);
		
		p.displayAge();
	}
}