package Q05;

public class Main {
    public static void main(String[] args) {
        Payment paymentRef;

        paymentRef = new CashPayment("TXN001", "Alex", 50.0, 60.0);
        paymentRef.processPayment();

        System.out.println();

        paymentRef = new CardPayment("TXN002", "Jordan", 120.50, "1234567890123456");
        paymentRef.processPayment();

        System.out.println();

        paymentRef = new OnlinePayment("TXN003", "Taylor", 85.00, "PayPal");
        paymentRef.processPayment();
    }
}
