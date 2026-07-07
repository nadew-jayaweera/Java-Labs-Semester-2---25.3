package Q03;

class CreditCard implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Swiping Credit Card for: $" + amount);
    }
}