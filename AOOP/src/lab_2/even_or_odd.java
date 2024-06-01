package lab_2;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class even_or_odd
{
	Scanner sc=new Scanner(System.in);
	@Test
	public void even_test() 
	{
		System.out.println("Enter Even Number");
		String s=evenorodd.checkEven(sc.nextInt());
		if(s.equals("even"))
		{
			System.out.println("Even");
		}
		else {
			System.out.println("Not an Even Number");
		}
		assertEquals("even",s);
	}
	@Test
	public void odd_test()
	{
		System.out.println("Enter Odd Number");
		String s=evenorodd.checkEven(sc.nextInt());
		if(s.equals("odd"))
		{
			System.out.println("Odd");
		}
		else {
			System.out.println("Not an Odd Number");
		}
		assertEquals("odd",s);
	}
}