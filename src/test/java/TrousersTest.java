import ShopProduct.Shoe;
import ShopProduct.Trousers;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrousersTest {


    Trousers trousers;

    @Before
    public void before(){
        trousers = new Trousers("DiDiJin", 5, 32,5);
    }

    @Test
    public void canGetBrand(){
        assertEquals("DiDiJin", trousers.getBrand());
    }

    @Test
    public void canGetSize(){
        assertEquals(5, trousers.getSize());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(32, trousers.getSellingPrice(),0.00);
    }

    @Test
    public void canGetDiscount(){
        assertEquals(5, trousers.getDiscount());
    }
}
