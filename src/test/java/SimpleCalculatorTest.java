import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

//you start by extending the test class from the standard JUnit junit.framework.TestCase.
// This base class includes the framework code that JUnit needs to automatically run the tests.
public class SimpleCalculatorTest extends TestCase {

    //A constructor is needed for the second type of method called Test.
    public SimpleCalculatorTest(String methodName) {
        super(methodName);
    }
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

//    public static Test suite()
//    {
//        return new TestSuite(SimpleCalculator.class);
//    }

    public static Test suite()
    {
        //You can add as many tests as you want!
        TestSuite suite = new TestSuite("All tests from part 1");
        suite.addTestSuite(SimpleCalculatorTest.class);
        suite.addTestSuite(AnotherCalculatorTest.class);
        suite.addTest(new SimpleCalculatorTest("testAdd"));
        suite.addTest(new SimpleCalculatorTest("testSubtract"));
        return suite;
    }

}

