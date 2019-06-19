import CarParts.Engine;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("electric");
    }
    @Test
    public void canGetType(){
        assertEquals("electric", engine.getType());
    }


}
