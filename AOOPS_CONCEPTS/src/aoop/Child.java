package aoop;

public class Child extends Parent
{
	int a;
	Child(int a,int b,int c)
	{
		super(b,c);
		this.a=a;
	}
	public static void main(String[] args) 
	{
		Child c=new Child(10,20,30);
		System.out.println(c.toString());
	}
	public String toString()
	{
		return(a+" "+super.toString());
	}
}
