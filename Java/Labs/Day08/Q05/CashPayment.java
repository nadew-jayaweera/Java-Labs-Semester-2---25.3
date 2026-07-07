package Q05;
class CashPayment extends Payment {
    private double cashTendered;

    public CashPayment(String paymentID, String customerName, double amount, double cashTendered) {
        super(paymentID, customerName, amount);
        this.cashTendered = cashTendered;
    }

    public double getCashTendered() { return cashTendered; }
    public void setCashTendered(double cashTendered) { this.cashTendered = cashTendered; }

    @Override
    public void processPayment() {
        double change = cashTendered - getAmount();
        System.out.println("Processing cash payment for " + getCustomerName() + ". Cash received: $" + cashTendered + ". Change given: $" + change);
    }
} 