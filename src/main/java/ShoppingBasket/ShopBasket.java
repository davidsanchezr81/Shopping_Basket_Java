package ShoppingBasket;
import Customer.Customer;
import Product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShopBasket {

    private Map<Product, Integer> products;
    private ArrayList<Product> shoppingList;
    private Customer customer;

    public ShopBasket() {
        this.products = new HashMap<>();
        this.shoppingList = new ArrayList<>();
        this.customer = customer;

    }

    // ADD PRODUCT TO SHOPPING BASKET
    public void addProduct(Product product) {

        if (products.get(product) != null) {
            products.put(product, products.get(product) + 1);
        } else {
            products.put(product, 1);
        }
    }

    // REMOVE PRODUCT TO SHOPPING BASKET
    public void removeProduct(Product product) {
        if (products.get(product) > 0) {
            products.remove(product);
        }
    }

    // EMPTY OUT TO SHOPPING BASKET
    public void emptyOutShopBasket() {
        products.clear();
    }

    // COUNT PRODUCTS IN SHOPPING BASKET
    public int countProducts() {
        int numberOfProducts = 0;
        for (Map.Entry number : products.entrySet()) {
            numberOfProducts += (int) number.getValue();
        }
        return numberOfProducts;
    }

    // SHOPPING LIST
    public ArrayList<Product> getShoppingList() {
        for (Map.Entry product : products.entrySet()) {
            shoppingList.add(((Product) product.getKey()));
        }
        return shoppingList;
    }


//    public boolean isALoyalCustomer(){
//        return customer.isLoyal();
//    }


    // GET TOTAL IN SHOPPING BASKET
    public double getTotalWithOneFree() {
        double total = 0;

        for (Product product : getShoppingList()) {
            if (product.isOneDiscount()) {
                if ((products.get(product) > 1)) {
                    if(products.get(product)% 2 == 0)
                {
                    total = product.getSellingPrice()*(products.get(product)*1/2);

                } else

                    {
                        total = product.getSellingPrice()*((products.get(product)*1/2) + 1);

                    }

                }else
                    { total = product.getSellingPrice();

                }
            }
                    else{
                    total = product.getSellingPrice()*(products.get(product));
                }
            }

        if (total > 20) {
            total -= (total * 0.1);
        }

//        if ( isALoyalCustomer() ) {
//            total -= (total * 0.02);
//        }
            return total;
        }
    }












