package ShopProduct;

import Interfaces.ISell;

import java.time.chrono.IsoChronology;

public class Shoe extends Product {



    public Shoe(String brand, int size, double sellingPrice, int discount){
       super(brand, size, sellingPrice,discount);
    }
}
