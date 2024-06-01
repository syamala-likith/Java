package aoop;

public class This
{
	int a,b,c;
	This()
	{
		this(10,20);		
	}
	This(int a,int b)
	{
		this(a,b,30);
		this.a=a;
		this.b=b;
	}
	This(int a,int b,int c)
	{
		this.c=c;
	}
	public static void main(String[] args) 
	{
		This t=new This();
		System.out.println(t.a+" "+t.b+" "+t.c);
	}

}
