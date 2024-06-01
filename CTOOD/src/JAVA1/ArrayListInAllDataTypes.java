package JAVA1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInAllDataTypes 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList<Integer> b=new ArrayList<Integer>();   //ArrayList<> obj=new ArrayList<>();
		a.add(10);
		a.add(50);
		a.add(55);
		a.add(70);
		a.add(2, 90);
		a.remove(0);
		a.set(2,80);
		b.addAll(a);
		Collections.sort(a);
		System.out.println("INTEGER");
		for(Integer i:a)
		{
			System.out.println(i);
		}
		System.out.println();
		for(Integer i:b)
		{
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("FLOAT");
		ArrayList<Float> c=new ArrayList<Float>();
		ArrayList<Float> d=new ArrayList<Float>();
		c.add((float) 85.12);
		c.add((float) 22.356);
		c.add((float)12.366);
		c.add((float)12.365);
		d.addAll(c);
		c.remove(0);
		Collections.sort(c);
		for(Float i:c)
		{
			System.out.println(i);
		}
		System.out.println();
		for(Float i:d)
		{
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("DOUBLE");
		ArrayList<Double> e=new ArrayList<Double>();
		e.add(12.63);
		e.add(56.89);
		for(Double i:e)
		{
			System.out.println(i);
		}
		
		
		System.out.println();
		System.out.println("STRING");
		ArrayList<String> f=new ArrayList<String>();
		f.add("My name is");
		f.add("Likith");
		f.add("Sai");
		f.add("Reddy");
		f.remove(3);
		Collections.sort(f);
		for(String i:f)
		{
			System.out.println(i);
		}
		
		
		System.out.println();
		System.out.println("CHARACHTER");
		ArrayList<Character> g=new ArrayList<Character>();
		g.add('A');
		g.add('F');
		g.add('B');
		g.add('C');
		g.add('E');
		g.add('D');
		g.remove(4);
		Collections.sort(g);
		for(Character i:g)
		{
			System.out.println(i);
		}
	}
	
	/* for(i=0;i<a.length();i++)
	 * {
	 *      syso(a[i]);
	 * }
	 */

}
