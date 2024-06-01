package JAVA;
import java.util.Scanner;
public class Student 
{
	static String name;
	static long id;
	static char gender;
	static String dept;
	static long phn;
	static int a,b,c;
	public static void main(String args[]) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("name");
		name=obj.next();
		System.out.println("id");
		id=obj.nextLong();
		System.out.println("gender");
		gender=obj.next().charAt(0);
		System.out.println("dept");
		dept=obj.next();
		System.out.println("phn");
		phn=obj.nextLong();
		System.out.println("a");
		a=obj.nextInt();
		System.out.println("b");
		b=obj.nextInt();
		System.out.println("c");
		c=obj.nextInt();
		displayDetails();
		obj.close();
	}
	static void displayDetails()
	{
		long n=id%100000;
		long n1=phn%10000;
		phn=phn/10000;
		long n2=phn%1000;
		long n3=phn/1000;
		int n4=(a+b+c)/3;
		System.out.println("name : "+name);
		System.out.println("id : "+n);
		System.out.println("gender : "+gender);
		System.out.println("dept : "+dept);
		System.out.println("phn : "+n3+"-"+n2+"-"+n1);
		System.out.println("percentage : "+n4+"%");
	}
}
