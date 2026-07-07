package Q04;

interface PaymentMethod {
    void processPayment(double amount);
}

class CreditCard implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Swiping Credit Card for: $" + amount);
    }
}

class PayPal implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal transfer for: $" + amount);
    }
}

class CashPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Handing over hard cash: $" + amount);
    }
}

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