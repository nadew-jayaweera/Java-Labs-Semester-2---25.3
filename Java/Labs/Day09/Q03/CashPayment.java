package Q03;

class CashPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Handing over hard cash: $" + amount);
    }
}
