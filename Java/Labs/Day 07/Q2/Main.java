package Q2;


public class Main {
    public static void main(String[] args){
        Printer client[] = new Printer[3];

        client[0] = new Printer();
        client[1] = new Printer();
        client[2] = new Printer();
        
        System.out.println(client[0].print(69));
        System.out.println(client[1].print("Heshan"));
        client[2].print("Ganja", 19);
    }
}
