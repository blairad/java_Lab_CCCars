import Dealership.CarParts.Engine;
import Dealership.CarParts.Tyre;
import Dealership.Dealership;
import Dealership.Vehicles.ElectricCar;
import Dealership.Vehicles.HybridCar;
import Dealership.Vehicles.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DealershipTest {

    Engine engine;
    Tyre tyre;
    ElectricCar electricCar;
    HybridCar hybridCar;
    PetrolCar petrolCar;
    Dealership dealership;

    @Before
    public void before(){
        engine = new Engine("hybrid");
        tyre = new Tyre("Dunlop",45);
        electricCar = new ElectricCar(engine, tyre, 6000, "Orange");
        hybridCar = new HybridCar(engine, tyre, 4000, "White");
        petrolCar = new PetrolCar(engine, tyre, 350, "Brown");
        dealership = new Dealership("Arnold Code Clan");
    }
    @Test
    public void canGetName(){
        assertEquals("Arnold Code Clan", dealership.getName());
    }
    @Test
    public void stockStartsEmpty(){

        assertEquals(0, dealership.getStockCount());
    }
    @Test
    public void canAddHybridCar(){
        dealership.addVehicle(hybridCar);
        assertEquals(1, dealership.getStockCount());
    }
    @Test
    public void canAddPetrolCar(){
        dealership.addVehicle(petrolCar);
        assertEquals(1,dealership.getStockCount());
    }
    @Test
    public void canAddElectricCar(){
        dealership.addVehicle(electricCar);
        assertEquals(1,dealership.getStockCount());
    }
}
