import Dealership.CarParts.Engine;
import Dealership.CarParts.Tyre;
import Dealership.Vehicles.PetrolCar;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PetrolCarTest {

    PetrolCar petrolCar;
    Engine engine;
    Tyre tyre;



    @Before
    public void before(){
        engine = new Engine("Petrol");
        tyre = new Tyre("Goodyear", 15);
        petrolCar = new PetrolCar(engine, tyre, 1000,"Green");
    }


    @Test
    public void getEngine() {
        assertEquals(engine, petrolCar.getEngine());
    }

    @Test
    public void getTyres() {
        assertEquals(tyre, petrolCar.getTyres());
    }

    @Test
    public void getColour() {
        assertEquals("Green", petrolCar.getColour());
    }

    @Test
    public void getPrice() {
        assertEquals(1000, petrolCar.getPrice());
    }

    @Test
    public void setPrice() {
        petrolCar.setPrice(5000);
        assertEquals(5000, petrolCar.getPrice());
    }
}
