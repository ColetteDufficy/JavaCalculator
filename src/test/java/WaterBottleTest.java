import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle johnsWaterBottle;

    @Before
    public void before(){
        johnsWaterBottle = new WaterBottle(100);
    }

    @Test
    public void has100Volume(){
        assertEquals(100, johnsWaterBottle.volume);
    }

    @Test
    public void canDrink(){
        assertEquals(90, johnsWaterBottle.drink());
    }

    @Test
    public void canDrinkMore(){
        johnsWaterBottle.drink();
        johnsWaterBottle.drink();
        assertEquals(80, johnsWaterBottle.volume);
    }

    @Test
    public void emptyBottle(){
        johnsWaterBottle.empty();
        assertEquals(0, johnsWaterBottle.volume);
    }

    @Test
    public void fillBottle(){
        johnsWaterBottle.fillUp();
        assertEquals(100, johnsWaterBottle.volume);
    }

}
