import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaleTest {

    Sale sale1;

    @Before
    public void before(){
        sale1 = new Sale(2, 35);
    }

    @Test
    public void totalSingleSale(){
        assertEquals(70, sale1.amount());
    }
}
