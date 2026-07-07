package Q03;

public class Main {
    public static void main(String[] args) {
        
        PaymentMethod[] wallet = {
            new CreditCard(),
            new PayPal(),
            new CashPayment()
        };

        System.out.println("--- Checkout Time ---");

        for (PaymentMethod method : wallet) {

            method.processPayment(50.00); 
        }
    }
}
