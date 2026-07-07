package Q05;

class OnlinePayment extends Payment {
    private String transactionGateway;

    public OnlinePayment(String paymentID, String customerName, double amount, String transactionGateway) {
        super(paymentID, customerName, amount);
        this.transactionGateway = transactionGateway;
    }

    public String getTransactionGateway() { return transactionGateway; }
    public void setTransactionGateway(String transactionGateway) { this.transactionGateway = transactionGateway; }

    @Override
    public void processPayment() {
        System.out.println("Processing online payment of $" + getAmount() + " securely through " + transactionGateway + " for " + getCustomerName());
    }
}
