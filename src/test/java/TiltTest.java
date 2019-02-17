import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TiltTest {

    Tilt tilt;

    @Before
    public void before(){
        tilt = new Tilt(0);
    }


    @Test
    public void tiltStartsEmpty(){
        assertEquals(0, tilt.getTiltbalance());
    }
}
