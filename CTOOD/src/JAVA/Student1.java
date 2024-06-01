package JAVA;

public class Student1
{
	static String name;
	static long id;
	static char gender;
	static String dept;
	static long phn;
	static int a,b,c;

	public static void main(String args[]) 
	{
		name=args[0];
		id=Long.parseLong(args[1]);
		gender=args[2].charAt(0);
		dept=args[3];
		phn=Long.parseLong(args[4]);
		a=Integer.parseUnsignedInt(args[5]);
		b=Integer.parseUnsignedInt(args[6]);
		c=Integer.parseUnsignedInt(args[7]);
		displayDetails();
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
