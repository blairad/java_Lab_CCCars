import Dealership.CarParts.Tyre;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre("Goodyear", 40);
    }
    @Test
    public void canGetBrand(){
        assertEquals("Goodyear", tyre.getBrand());
    }
    @Test
    public void canGetSize(){
        assertEquals(40, tyre.getSize());
    }

}
