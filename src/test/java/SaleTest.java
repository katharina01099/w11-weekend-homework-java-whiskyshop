import org.junit.Before;
import org.junit.Test;

public class SaleTest {

    Sale sale;

    @Before
    public void before(){
        sale1 = new Sale;
    }

    @Test
    public void totalSingleSale(){
        assert.Equals(70, sale1.amount());
    }
}
