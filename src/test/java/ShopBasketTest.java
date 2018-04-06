import ShopProduct.Shoe;
import ShopProduct.Trousers;
import ShoppingBasket.ShopBasket;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShopBasketTest {

    ShopBasket shopBasket;
    Shoe shoe;
    Trousers trousers;


    @Before
    public void before(){
        shopBasket = new ShopBasket(23451);
        shoe = new Shoe("Clarks", 10,100.00,20);
        trousers = new Trousers("Levis",8,89.00,15);
    }


    @Test
    public void getNumber(){
        assertEquals(23451, shopBasket.getNumber());
    }

    @Test
    public void canAddItemsToBasket(){
        assertEquals(0, shopBasket.countProducts());
        shopBasket.addProduct(shoe);
        assertEquals(1, shopBasket.countProducts());
    }

    @Test
    public void canRemoveItemsFromBasket(){
        assertEquals(0, shopBasket.countProducts());
        shopBasket.addProduct(shoe);
        assertEquals(1, shopBasket.countProducts());
        shopBasket.removeProduct(shoe);
        assertEquals(0,shopBasket.countProducts());
    }

    @Test
    public void canEmptyShopBasket(){
        assertEquals(0, shopBasket.countProducts());
        shopBasket.addProduct(shoe);
        shopBasket.addProduct(shoe);
        shopBasket.addProduct(trousers);
        shopBasket.addProduct(trousers);
        assertEquals(4, shopBasket.countProducts());
        shopBasket.clearShopBasket();
        assertEquals(0,shopBasket.countProducts());
    }

}
