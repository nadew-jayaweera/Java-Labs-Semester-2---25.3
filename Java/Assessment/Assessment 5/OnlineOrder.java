class OnlineOrder {
    int orderId;
    String customerName;
    double itemPrice;
    int quantity;

    OnlineOrder(int orderId, String customerName, double itemPrice, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    double calculateTotal(double discountPercentage) {
        double total = itemPrice * quantity;
        double discount = total * (discountPercentage / 100);
        return total - discount;
    }

    void updateQuantity(int newQuantity) {
        if (newQuantity > 0) {
            quantity = newQuantity;
            System.out.println("Quantity updated to " + newQuantity + ".");
        } else {
            System.out.println("Invalid quantity.");
        }
    }

    String getOrderSummary() {
        return "Order ID: " + orderId +
               ", Customer Name: " + customerName +
               ", Item Price: Rs. " + itemPrice +
               ", Quantity: " + quantity;
    }

    public static void main(String[] args) {
        OnlineOrder order1 = new OnlineOrder(101, "Kasun Perera", 2500.0, 2);
        OnlineOrder order2 = new OnlineOrder(102, "Nimal Silva", 1500.0, 5);

        double finalAmount = order1.calculateTotal(10);
        System.out.println("Final Amount after 10% discount: Rs. " + finalAmount);

        order1.updateQuantity(4);

        order2.updateQuantity(-2);

        System.out.println("\nOrder Summaries:");
        System.out.println(order1.getOrderSummary());
        System.out.println(order2.getOrderSummary());
    }
}