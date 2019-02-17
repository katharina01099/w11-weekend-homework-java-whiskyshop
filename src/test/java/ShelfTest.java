import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShelfTest {

    Shelf shelf1;
    Bottle bottle1;


    @Before
    public void before(){
        shelf1 = new Shelf(3, 40);
        bottle1 = new Bottle("Laphroigh", SizeType.LARGE, RegionType.ISLA);
    }

    @Test
    public void shelfHasANumber(){
        assertEquals(3, shelf1.getShelfNumber());
    }

    @Test
    public void shelfHasCapacity(){
        assertEquals(40, shelf1.getShelfCapacity());
    }

    @Test
    public void shelfStartsEmpty(){
        assertEquals(0, shelf1.numberOfBottles());
    }

    @Test
    public void shelfCanTakeBottles(){
        shelf1.addBottles(bottle1);
        assertEquals(1, shelf1.numberOfBottles());
    }

    @Test
    public void shelfCannotTakeBottlesWhenFull(){
        for (int i = 0; i<40; i++){
            shelf1.addBottles(bottle1);
        }
        shelf1.addBottles(bottle1);
        assertEquals(40, shelf1.numberOfBottles());

    }

    @Test
    public void shelfCanCheckoutBottles(){
        assertEquals(39, shelf1.checkOutBottles());
    }
}

