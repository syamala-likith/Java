package lab_2;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.Test;

public class pass {

	@Test
	public void testPass()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter Your Password");
		boolean a=Password.passwordLength(sc.next());
		if(a)
		{
			System.out.println("Valid Password");
		}
		else 
		{
			System.out.println("Not Valid");
		}
		assertEquals(true,a);
	}
	@After
	public void test()
	{
		System.out.println("Completed....!");
	}
}
