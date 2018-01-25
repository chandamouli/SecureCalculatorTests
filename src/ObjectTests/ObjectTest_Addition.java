package ObjectTests;
import Operations.Addition; 
import Operations.ICalculateOperation;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;

/*import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
*/

public class ObjectTest_Addition extends Addition{
	
	ICalculateOperation operation;
	
	@Before
	public void setUp()
	{
		operation = new Addition();		
	}

	@Test
	//test to check addition - baseflow - ValidInputs
	public void testAdditionWithValidInput() 
	{
		int[] operands = {2,3};
		assertEquals(5,operation.getResult(operands));				
	}
	//test if IndexOutOfBoundException is displayed for
	//no empty input
	@Test(expected = IndexOutOfBoundsException.class)
	public void testIndexOutOfBoundsException() {
	    int[] emptyList = {};
	    operation.getResult(emptyList);	    
	}
	//test if input parameter is not integer
	@Test
	public void testAdditionWithInvalidInput()
	{
		
	}
	
	@After
	public void tearDown()
	{
		
	}
	
	/*public static void main (String[] args) {
        Result result = JUnitCore.runClasses(ObjectTest_Addition.class);
        for (Failure failure : result.getFailures()) { 
               System.out.println(failure.toString()); 
           } 
       System.out.println(result.wasSuccessful());
         
       }
	*/
}


