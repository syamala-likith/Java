package aoop;

public class B extends A
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.setA(10);
		obj.setB(5);
		obj.add(obj.getA(), obj.getB());
	}
	
	void add(int a, int b) 
	{
		System.out.println(a+b);
	}
	
}
