package ShoppingBasket;

import Interfaces.ISell;
import ShopProduct.Product;
import com.sun.tools.javac.jvm.Items;

import java.util.ArrayList;

public class ShopBasket {

    private int number;
    private ArrayList<Product> products;

    public ShopBasket(int number){
        this.number = number;
        products = new ArrayList<Product>();

    }

    public int getNumber() { return number; }

    public void addProduct(Product product){ products.add(product); }

    public void removeProduct(Product product){ products.remove(product); }

    public int countProducts(){ return products.size(); }

    public void clearShopBasket(){ products.clear(); }

    }



