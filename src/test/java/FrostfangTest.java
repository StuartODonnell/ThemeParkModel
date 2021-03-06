import customers.Customer;
import org.junit.Before;
import org.junit.Test;
import rides.Frostfang;


import static org.junit.Assert.assertEquals;

public class FrostfangTest {

    Frostfang frostfang;
    Customer customer;

    @Before
    public void before(){

        frostfang = new Frostfang("Frostfang", 100, 10, 10.50);
    }

    @Test
    public void hasName(){
        assertEquals("Frostfang", frostfang.getName());

    }

    @Test
    public void hasMinHeight(){
        assertEquals(100, frostfang.getMinHeight());

    }

    @Test
    public void hasMinAge(){
        assertEquals(10, frostfang.getMinAge());

    }

    @Test
    public void hasAdmissionPrice(){
        assertEquals(10.50, frostfang.getAdmissionPrice(),0.1);

    }

    @Test
    public void canAdmitCustomer(){
        assertEquals("Customer has been admitted to Frostfang", frostfang.admitCustomer());
    }
    @Test
    public void canGetCustomerCount(){
        assertEquals(0, frostfang.getCustomerCount());
    }

    @Test
    public void canAddCustomersToRide(){
        frostfang.admitCustomer(customer);
        frostfang.admitCustomer(customer);

        assertEquals(2, frostfang.getCustomerCount());
    }

}
