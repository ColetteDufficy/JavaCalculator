import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer johnsPrinter;

    @Before
    public void before(){
        johnsPrinter = new Printer(10, 8);
    }

    @Test
    public void hasPaper(){
        assertEquals(10, johnsPrinter.getPages());
    }

    @Test
    public void hasToner(){
        assertEquals(8, johnsPrinter.getToner());
    }

    @Test
    public void numOfToPrint(){
        assertEquals(8, johnsPrinter.toPrint(4, 2));
    }

    @Test
    public void canPrint(){
        assertEquals(4, johnsPrinter.print(3, 2));
    }

    @Test
    public void cannotPrint(){
        assertEquals(10, johnsPrinter.print(10, 3));
    }

    @Test
    public void canUseToner(){
        johnsPrinter.print(1, 1);
        assertEquals(7, johnsPrinter.getToner());
    }

}
