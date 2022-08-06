import junit.framework.TestCase;

//you start by extending the test class from the standard JUnit junit.framework.TestCase.
// This base class includes the framework code that JUnit needs to automatically run the tests.
public class SimpleCalculatorTest extends TestCase {
//The JUnit team has defined three discrete goals for the framework:
//
//The framework must help us write useful tests.
//
//The framework must help us create tests that retain their value over time.
//
//The framework must help us lower the cost of writing tests by reusing code.

    public void testAdd(){
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.add(5,5);
        assertEquals(10, result,0 );
//Which brings us to the mysterious delta parameter. Most often, the delta parameter can be zero,
// and you can safely ignore it. It comes into play with calculations that are not always precise,
// which includes many floating-point calculations. The delta provides a plus/minus factor. So if the actual
// is within the range (expected-delta) and (expected+delta), the test will still pass.
    }


////    void twoPlusTwo(){
////        fail("Not Implemented");
//        SimpleCalculator calculator = new SimpleCalculator();
//        assertEquals(4, calculator.add(2,2));
//        System.out.println("test passed");
//    }

//    void testComputeCircleRadius(){
//        SimpleCalculator simpleCalculator = new SimpleCalculator();
//        assertEquals(314.1592653589793, simpleCalculator.computeCircleArea(10), "Should return circle area.");
    }

