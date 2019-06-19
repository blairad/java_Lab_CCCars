import Dealership.People.Dealer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DealerTest {

    Dealer dealer;

    @Before
    public void before(){
        dealer = new Dealer("Gil Gunderson");
    }
    @Test
    public void hasNamne(){
        assertEquals("Gil Gunderson", dealer.getName());
    }

}
