import customers.Customer;
import org.junit.Before;
import org.junit.Test;
import rides.Giantsbane;
import rides.Ride;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import rides.Giantsbane;

public class GiantsbaneTest {

  Giantsbane giantsbane;
  Customer customer;


    @Before
    public void before(){
      giantsbane = new Giantsbane("Giantsbane", 120, 12, 12.50);

    }

    @Test
    public void hasName(){
        assertEquals("Giantsbane", giantsbane.getName());

    }

    @Test
    public void hasMinHeight(){
        assertEquals(120, giantsbane.getMinHeight());

    }

    @Test
    public void hasMinAge(){
        assertEquals(12, giantsbane.getMinAge());

    }

    @Test
    public void hasAdmissionPrice(){
        assertEquals(12.50, giantsbane.getAdmissionPrice(),0.1);

    }

    @Test
    public void canAdmitCustomer(){
        assertEquals("Customer has been admitted to Giantsbane", giantsbane.admitCustomer());
    }

    @Test
    public void canGetCustomerCount(){
        assertEquals(0, giantsbane.getCustomerCount());
    }

    @Test
    public void canAddCustomersToRide(){
        giantsbane.admitCustomer(customer);
        giantsbane.admitCustomer(customer);

        assertEquals(2, giantsbane.getCustomerCount());
    }

}
