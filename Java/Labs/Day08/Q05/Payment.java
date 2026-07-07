package Q05;

public class Payment {
    private String paymentID;
    private String customerName;
    private double amount;

    public Payment(String paymentID, String customerName, double amount) {
        this.paymentID = paymentID;
        this.customerName = customerName;
        this.amount = amount;
    }

    public String getPaymentID() { return paymentID; }
    public void setPaymentID(String paymentID) { this.paymentID = paymentID; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public void processPayment() {
        System.out.println("Processing basic payment of $" + amount);
    }
}
