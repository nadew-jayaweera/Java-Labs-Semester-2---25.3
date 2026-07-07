package Q2;

public class Printer {
    String print(String name){
        return "Hello " + name;
    }
    int print(int value){
        return value;
    }
    void print(String message, int copies){
        System.out.println(message + " is " + copies + " years old.");
    }
}
