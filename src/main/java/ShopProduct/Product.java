package ShopProduct;

import Interfaces.ISell;

public abstract class Product {

    private String brand;
    private int size;
    private double sellingPrice;
    private int discount;

    public Product(String brand, int size, double sellingPrice, int discount){
        this.brand = brand;
        this.size = size;
        this.sellingPrice = sellingPrice;
        this.discount = discount;
    }

    public String getBrand(){ return this.brand; }

    public int getSize(){ return this.size; }

    public double getSellingPrice(){ return this.sellingPrice; }

    public int getDiscount(){ return this.discount; }

}
