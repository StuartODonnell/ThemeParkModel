import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Jorah", 200, 30, 100.00);
    }

    @Test
    public void hasName(){
        assertEquals("Jorah", customer.getName());

    }
}
