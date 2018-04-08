import Customer.Customer;
import Product.Product;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ProductTest {

    Product product;


        @Before
        public void before(){
            product = new Product("Avia", 24,true);
        }

        @Test
        public void canGetBrand() {
            assertEquals("Avia", product.getBrand());
        }

        @Test
        public void canGetSellingPrice() {
            assertEquals(24, product.getSellingPrice(),0.01);
        }

        @Test
        public  void canGetOneDiscount(){
            assertEquals(true, product.isOneDiscount());
        }



}
