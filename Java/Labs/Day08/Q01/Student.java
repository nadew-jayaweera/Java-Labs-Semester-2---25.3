public class Student extends Person {
    private String course;

    public Student(int personID, String name, int age, String course){
        super(personID, name, age);
        this.course = course;
    }

    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course = course;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Course: " + course);
    }
}
