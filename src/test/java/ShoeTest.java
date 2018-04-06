import ShopProduct.Shoe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoeTest {

    Shoe shoe;

    @Before
    public void before(){
        shoe = new Shoe("Reebook", 9, 45,0);
    }

    @Test
    public void canGetBrand(){
        assertEquals("Reebook", shoe.getBrand());
    }

    @Test
    public void canGetSize(){
        assertEquals(9, shoe.getSize());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(45, shoe.getSellingPrice(),0.00);
    }

    @Test
    public void canGetDiscount(){
        assertEquals(0, shoe.getDiscount());
    }

}
