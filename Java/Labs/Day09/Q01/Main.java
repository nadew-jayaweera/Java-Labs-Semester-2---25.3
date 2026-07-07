package Q01;

public class Main {
    public static void main(String [] args){
        Product item = new Product(1001, 120, 50);

        Product item1 = new Product(1001,-102.00, -50);

       
        System.out.println(item.getTotalValue());
        System.out.println(item1.getTotalValue());
    }
}
