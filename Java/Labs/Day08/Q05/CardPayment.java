package Q05;
class CardPayment extends Payment {
    private String cardNumber;

    public CardPayment(String paymentID, String customerName, double amount, String cardNumber) {
        super(paymentID, customerName, amount);
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    @Override
    public void processPayment() {
        System.out.println("Processing card payment of $" + getAmount() + " for " + getCustomerName() + " using card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }
}
