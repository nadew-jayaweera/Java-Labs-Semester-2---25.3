public class Person {
    String firstName;
    String lastName;

     Person(){
         firstName = "Navitha";
         lastName = "Navindul";

     }
     void setPersonName(String firstName,String lastName){
         this.firstName=firstName;
         this.lastName = lastName;
     }
     String getPersonName(){
         return firstName + lastName;
     }





     public static void main(String[] args){
         Person p1 = new Person();
         Person p2 = new Person();
         p2.setPersonName("Sadamith","Heshan");
         System.out.println(p1.firstName + p1.lastName);
         System.out.println(p2.getPersonName());


     }
}