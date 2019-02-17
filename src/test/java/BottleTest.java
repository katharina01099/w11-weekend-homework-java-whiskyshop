import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    Bottle bottle;

    @Before
    public void before(){
        bottle = new Bottle("Glenmorangie", SizeType.MEDIUM, RegionType.SPEYSIDE, 35);

    }

    @Test
    public void bottleHasABrand(){
        assertEquals("Glenmorangie", bottle.getBrand());
    }

    @Test
    public void bottleHasASize(){
        assertEquals(SizeType.MEDIUM, bottle.getSize());
    }

    @Test
    public void bottleHasARegion(){
        assertEquals(RegionType.SPEYSIDE, bottle.getRegion());
    }

    @Test
    public void bottleHasAPrice(){
        assertEquals(35, bottle.getPrice());
    }
}
