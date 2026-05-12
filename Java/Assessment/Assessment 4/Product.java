public class Product{
	int productId;
	String productName;
	double unitPrice;
	
	public Product(){
		productId = 0;
		productName = "Unknown Product";
		unitPrice = 0.0;
	}
	
	public Product(int productId,String productName,double unitPrice){
		this.productId = productId;
		this.productName = productName;
		this.unitPrice = unitPrice;
	}
	
	public void applyDiscount(double presentage){
		unitPrice = unitPrice - (unitPrice*presentage/100);
		
		System.out.println("Updated price after: "+presentage+"% discount: "+unitPrice);
	}
	
	public String getProductLabel() {
        return productId + " - " + productName + " - Rs. " + unitPrice;
    }
	
	public static void main(String[] args) {
        Product product1 = new Product();

        Product product2 = new Product(101, "Laptop", 150000.00);

        product2.applyDiscount(15);
		
        System.out.println(product1.getProductLabel());
        System.out.println(product2.getProductLabel());
    }
}