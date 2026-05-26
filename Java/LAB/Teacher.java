public class Teacher {
    String name;
    String subject;

    void setName(String name){
        this.name = name;
    }
    void setSubject(String subject){
        this.subject = subject;

    }
    String getName(){
        return name;
    }
    String getSubject(){
        return subject;
    }
    public static void main(String[] args){
        Teacher t1 = new Teacher();
        t1.setName("Kaviru");
        t1.setSubject("Mathematics");
        System.out.println("Teacher Name: " + t1.getName());
        System.out.println("Subject: " + t1.getSubject());
    }

}