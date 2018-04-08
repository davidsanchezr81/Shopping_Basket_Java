import Product.Product;
import ShoppingBasket.ShopBasket;
import Customer.Customer;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShopBasketTest {

    ShopBasket shopBasket;
    Product product1;
    Product product2;
    Product product3;
    Customer customer;


    @Before
    public void before(){
        shopBasket = new ShopBasket();
        product1 = new Product("Nike",10.00,true);
        product2 = new Product("Adidas",7.50,true);
        product3 = new Product("Levis",10,false);
        customer = new Customer("Peter", true);
    }



    @Test
    public void canAddItemsToShopBasket(){
       shopBasket.addProduct(product1);
       shopBasket.addProduct(product1);
       shopBasket.addProduct(product2);
       shopBasket.addProduct(product2);
        assertEquals(4, shopBasket.countProducts());
    }

    @Test
    public void canRemoveItemsFromShopBasket(){
        shopBasket.addProduct(product1);
        shopBasket.addProduct(product1);
        shopBasket.addProduct(product2);
        shopBasket.addProduct(product2);
        assertEquals(4, shopBasket.countProducts());
        shopBasket.removeProduct(product1);
        assertEquals(2,shopBasket.countProducts());
    }

    @Test
    public void canEmptyOutShopBasket(){
        shopBasket.addProduct(product1);
        shopBasket.addProduct(product1);
        shopBasket.addProduct(product2);
        shopBasket.addProduct(product2);
        assertEquals(4, shopBasket.countProducts());
        shopBasket.emptyOutShopBasket();
        assertEquals(0,shopBasket.countProducts());
    }


    @Test
    public void canGetShoppingList(){
        shopBasket.addProduct(product1);
        shopBasket.addProduct(product1);
        shopBasket.addProduct(product2);
        shopBasket.addProduct(product2);
        ArrayList<Product> shoppingList = shopBasket.getShoppingList();
        assertEquals(2,shoppingList.size());
    }

    @Test
    public void canGetTotalWithOneFreePlusDiscount(){
        shopBasket.addProduct(product1);
        shopBasket.addProduct(product1);
ArrayList<Product> shoppingList = shopBasket.getShoppingList();
        assertEquals(1,shoppingList.size());
        assertEquals(2, shopBasket.countProducts());
        assertEquals(10, shopBasket.getTotalWithOneFree(),0.01);
        shopBasket.addProduct(product1);
        assertEquals(3, shopBasket.countProducts());
        assertEquals(20, shopBasket.getTotalWithOneFree(),0.01);
        shopBasket.addProduct(product1);
        assertEquals(20, shopBasket.getTotalWithOneFree(),0.01);
        shopBasket.addProduct(product1);
        shopBasket.addProduct(product1);
        assertEquals(27, shopBasket.getTotalWithOneFree(),0.01);

    }

    @Test
    public void canGetTotalWithOneFree1PlusDiscount(){
        shopBasket.addProduct(product1);
        shopBasket.addProduct(product1);
        ArrayList<Product> shoppingList = shopBasket.getShoppingList();
        assertEquals(1,shoppingList.size());
        assertEquals(2, shopBasket.countProducts());
        assertEquals(10, shopBasket.getTotalWithOneFree(),0.01);
        shopBasket.addProduct(product1);
        assertEquals(3, shopBasket.countProducts());
        assertEquals(20, shopBasket.getTotalWithOneFree(),0.01);
        shopBasket.addProduct(product1);
        assertEquals(20, shopBasket.getTotalWithOneFree(),0.01);
        shopBasket.addProduct(product1);
        shopBasket.addProduct(product1);
        assertEquals(27, shopBasket.getTotalWithOneFree(),0.01);
        shopBasket.addProduct(product2);
        shopBasket.addProduct(product2);
        assertEquals(7.50, shopBasket.getTotalWithOneFree(),0.01);
        shopBasket.addProduct(product2);
        shopBasket.addProduct(product2);
        assertEquals(15, shopBasket.getTotalWithOneFree(),0.01);

    }

    @Test
    public void cannotGetTotalWithOneFree(){
        shopBasket.addProduct(product3);
        shopBasket.addProduct(product3);
        ArrayList<Product> shoppingList = shopBasket.getShoppingList();
        assertEquals(1,shoppingList.size());
        assertEquals(2, shopBasket.countProducts());
        assertEquals(20, shopBasket.getTotalWithOneFree(),0.01);
        shopBasket.addProduct(product3);
        assertEquals(3, shopBasket.countProducts());
        assertEquals(27, shopBasket.getTotalWithOneFree(),0.01);
        shopBasket.addProduct(product3);
        assertEquals(36, shopBasket.getTotalWithOneFree(),0.01);
    }
}
