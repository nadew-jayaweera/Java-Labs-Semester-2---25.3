package Q01;
public class Product {
    private int productCode;
    private double price;
    private int quantity;

    Product(int productCode, double price, int quantity){
        this.productCode = productCode;
        setPrice(price);
        setQ(quantity);     //add conditions in the constructor it self to show..
    }

    public int getCode(){
        return productCode;
    }
    public void setCode(int productCode){
        this.productCode = productCode;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        if (price > 0){
            this.price = price;
        }else{
            System.out.println("Price value cannot be negative.");
        }
    }

    public int getQ(){
        return quantity;
    }
    public void setQ(int quantity){
        if(quantity > 0){
            this.quantity = quantity;
            System.out.println("Success!!");
            System.out.println("     ");
        }else{
            System.out.println("Enter an valid quantity");
            System.out.println("     ");
        }
    }

    public double getTotalValue(){
        return price * quantity;
    }
}