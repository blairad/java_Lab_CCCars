import Dealership.CarParts.Engine;
import Dealership.CarParts.Tyre;
import Dealership.People.Customer;
import Dealership.Vehicles.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CustomerTest {

    Customer customer;
    HybridCar hybridCar;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        customer = new Customer("Tam", 10000);
        hybridCar = new HybridCar(engine, tyre, 5000, "Yellow");
    }
    @Test
    public void getName() {
        assertEquals("Tam",customer.getName());
    }
    @Test
    public void getHasMoney() {
        assertEquals(10000,customer.getHasMoney());
    }
    @Test
    public void buyVehicle() {
        customer.buyVehicle(hybridCar);
        assertEquals(hybridCar, customer.getVehicle());
    }
}
