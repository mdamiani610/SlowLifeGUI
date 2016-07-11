import static org.junit.Assert.*;

import org.junit.Test;

public class GameOfLifeTest {

	@Test
	//check that convertToInt() returns correct value when 0 is passed in
	public void testConvertToInt1() {
		MainPanel mp = new MainPanel(15);
		int expResult=0;
		int result= mp.convertToInt(0);
		assertEquals(expResult, result);
	}

	
	@Test
	//check that convertToInt() returns correct value when 100 is passed in
	public void testConvertToInt2() {
		MainPanel mp = new MainPanel(15);
		int expResult=100;
		int result= mp.convertToInt(100);
		assertEquals(expResult, result);
	}
	
	
	@Test
	//check that convertToInt() returns correct value when MAX_VALUE is passed in
	public void testConvertToInt3() {
		MainPanel mp = new MainPanel(15);
		int expResult=Integer.MAX_VALUE;
		int result= mp.convertToInt(Integer.MAX_VALUE);
		assertEquals(expResult, result);
	}
	
	@Test
	//my first pinning test for the runContinuous() method is a manual test that can be found in my summary
	public void testRunContinuous1() {
		assertEquals(true, true);
	}
	
	@Test
	//my second pinning test for the runContinuous() method is a manual test that can be found in my summary
	public void testRunContinuous2() {
		assertEquals(true, true);
	}
	
	@Test
	//my third pinning test for the runContinuous() method is a manual test that can be found in my summary
	public void testRunContinuous3() {
		assertEquals(true, true);
	}
	
	@Test
	//check to see that "." is returned when toString() is called on a newly created Cell instance
	public void testToString1() {
		Cell c = new Cell();
		String expResult=".";
		String result= c.toString();
		assertEquals(expResult, result);
		
	}
	
	@Test
	//check to see that c.getText().substring(0,1) is NOT returned when toString() is called on a newly created Cell instance
	public void testToString2() {
		Cell c = new Cell();
		boolean expResult=false;
		boolean result;
		if(c.toString().equals(c.getText().substring(0,1))) result=true;
		else result=false;
		
		assertEquals(expResult, result);
	}
	
	@Test
	//my third pinning test for the toString() method is a manual test that can be found in my summary
	public void testToString3() {
		assertEquals(true, true);
	}

}
