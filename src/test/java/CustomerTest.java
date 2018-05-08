import customers.Customer;
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
    public void canGetName(){
        assertEquals("Jorah", customer.getName());
        }

    @Test
    public void canSetName(){
        customer.setName("Jeor");
        assertEquals("Jeor", customer.getName());
        }

    @Test
    public void canGetHeight(){
        assertEquals(200, customer.getHeight());
    }

    @Test
    public void canSetHeight(){
        customer.setHeight(210);
        assertEquals(210, customer.getHeight());
    }

    @Test
    public void canGetAge(){
        assertEquals(30, customer.getAge());
    }

    @Test
    public void canSetAge(){
        customer.setAge(31);
        assertEquals(31, customer.getAge());
    }

    @Test
    public void canGetCash(){
        assertEquals(100.00, customer.getCash(),0.1);
    }

    @Test
    public void canSetCash(){
        customer.setCash(90.00);
        assertEquals(90.00, customer.getCash(), 0.1);
    }





}
