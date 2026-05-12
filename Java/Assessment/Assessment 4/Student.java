public class Student{
	int studentId;
	String name;
	int age;
	double gpa;
	
	public Student(int studentId, String name, int age, double gpa){
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}
	
	public void introduce(){
		System.out.println("My anme is "+name+", StudentId is: "+studentId+", age is "+age+", GPA is: "+gpa);
	}
	
	public void updateGpa(double newGpa){
		gpa = newGpa;
		System.out.println("GPA is update to: "+gpa);
	}
	
	public static void main(String[] arg){
		Student student1 = new Student(001,"john",25,13.0);
		Student student2 = new Student(002,"due",45,12.0);
		
		student1.introduce();
		student2.introduce();
		
		student1.updateGpa(0.56);
	}
	
	
}