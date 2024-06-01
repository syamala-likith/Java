package HA1;
import Exam.Utility;
public class Demo 
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		System.out.println(Utility.findSmallest(a));
		System.out.println(Utility.findSmallest(1, 2));
		System.out.println(Utility.findSmallest(1, 2, 3));
	}
}
