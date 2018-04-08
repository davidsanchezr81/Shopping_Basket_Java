import Customer.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;


    @Before
    public void before(){
        customer = new Customer("George", true);
    }

    @Test
    public void getCustomerName() {
        assertEquals("George", customer.getName());
    }

    @Test
    public void isLoyal() {
        assertEquals(true, customer.isLoyal());
    }
}
