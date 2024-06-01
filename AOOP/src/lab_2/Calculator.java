package lab_2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Calculator 
{
	@Before
	public void testAddPassBeforeTest()
	{
		System.out.println("Pass Test");
	}
	@Test
	public void testAddPass()
	{
		assertEquals("error in add()",3,Calc.add(1, 2));
	}
	@Test
	public void testSubPass()
	{
		assertEquals(2,Calc.sub(5, 3));
	}
	@Test
	public void testMulPass()
	{
		assertEquals(25,Calc.mul(5, 5));
	}
	@Test
	public void testDivPass()
	{
		assertEquals(1,Calc.div(5, 5));
	}
	@Test
	public void testAddFail()
	{
		assertNotEquals(1,Calc.add(1, 2));
	}
	@Test
	public void testSubFail()
	{
		assertNotEquals(3,Calc.sub(5, 3));
	}
	@Test
	public void testMulFail()
	{
		assertNotEquals(2,Calc.mul(5, 5));
	}
	@Test
	public void testDivFail()
	{
		assertNotEquals(3,Calc.div(5, 5));
	}
}
