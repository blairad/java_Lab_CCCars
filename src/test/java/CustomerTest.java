import Dealership.People.Customer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Tam", 10000);
    }
    @Test
    public void getName() {
        assertEquals("Tam",customer.getName());
    }
    @Test
    public void getHasMoney() {
        assertEquals(10000,customer.getHasMoney());
    }
}
