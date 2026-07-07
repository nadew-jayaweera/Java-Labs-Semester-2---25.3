public class Person {
    private int personID;
    private String name;
    private int age;

     public Person(int personID, String name, int age){
        this.personID = personID;
        this.name = name;
        this.age = age;
    }

    public int getPersonid(){
        return personID;
    }
    public void setPersonID(int personID){
        this.personID = personID;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("ID: " + personID + ", Name: " + name + ", Age: " + age);
}
}