import junit.framework.TestCase;

public class AnotherCalculatorTest extends TestCase {

    public void testSubtract(){
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.subtract(5,4);
        assertEquals(1, result,0);
    }


}