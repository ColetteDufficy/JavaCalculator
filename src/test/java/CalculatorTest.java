import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest{
    @Test
    public void hasWorkingAddFunction(){
        assertEquals(3, Calculator.add(1, 2));
    }

    @Test
    public void hasWorkingSubtractFunction(){
        assertEquals(1, Calculator.subtract(3, 2));
    }

    @Test
    public void hasWorkingMultiplyFunction(){
        assertEquals(10, Calculator.multiply(2, 5));
    }

    @Test
    public void hasWorkingDivideFunction(){
        assertEquals(7.986842105263159, Calculator.divide(72.84, 9.12), 0.0);
    }

}
