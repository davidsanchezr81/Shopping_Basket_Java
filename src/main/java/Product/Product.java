package Product;

public class Product {

    private String brand;
    private double sellingPrice;
    private boolean onediscount;

    public Product(String brand, double sellingPrice, boolean onediscount){
        this.brand = brand;
        this.sellingPrice = sellingPrice;
        this.onediscount = onediscount;
    }

    public String getBrand(){ return this.brand; }

    public double getSellingPrice(){ return this.sellingPrice; }

    public boolean isOneDiscount(){
        return this.onediscount;
    }

}
