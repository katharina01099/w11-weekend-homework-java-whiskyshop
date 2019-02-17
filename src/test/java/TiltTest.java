import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TiltTest {

    Tilt tilt;
    Bottle bottle2;

    @Before
    public void before(){
        tilt = new Tilt(0);
        bottle2 = new Bottle("Glenmorangie", SizeType.AVERAG, RegionType.SPEYSIDE, 35)
    }


    @Test
    public void tiltStartsEmpty(){
        assertEquals(0, tilt.getTiltbalance());
    }

    @Test
    public void tillCanGetBill(){
        assertEquals(35.0, tilt.getBill());
    }
}
