package junit;

import static org.junit.Assert.*;
import org.junit.*;

public class TestCalc 
{

	@Before
	public void testandpassBeforeTest() 
	{
		System.out.println("Testing");
	}

	@Test
	public void testandPass() 
	{
		
		assertEquals(3,Calculator.add(1, 2));
		assertEquals(-3,Calculator.add(-1,-2));
		assertEquals(9,Calculator.add(9,0));
	}
	
	@Test
	public void testAndPass()
	{
		assertEquals(3,Calculator.sub(5, 2));
		assertEquals(2,Calculator.sub(7,5));
		assertEquals(9,Calculator.sub(9,0));
	}
	
	@Test
	public void testAndPASS()
	{
		assertEquals(3,Calculator.mul(3, 1));
		assertEquals(-3,Calculator.mul(3,-1));
		assertEquals(9,Calculator.mul(9,1));
	}
	
	@Test
	public void testANDPASS()
	{
		assertEquals(3,Calculator.div(6, 2));
		assertEquals(-3,Calculator.div(6,-2));
		assertEquals(9,Calculator.div(9,1));
	}
	@Test
	public void testandfail()
	{
		assertNotEquals(1,Calculator.add(1, 2));
	}
	
	@Test
	public void testAndfail()
	{
		assertNotEquals(1,Calculator.sub(5, 2));
	}
	
	@Test
	public void testAndFail()
	{
		assertNotEquals(1,Calculator.mul(5, 2));
	}
	
	@Test
	public void testANdfail()
	{
		assertNotEquals(1,Calculator.div(5, 1));
	}
	
	@After
	public void testAndPassAfterTest() 
	{
		System.out.println("Success");
	}
}