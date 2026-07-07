package Q03;

class PayPal implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal transfer for: $" + amount);
    }
}