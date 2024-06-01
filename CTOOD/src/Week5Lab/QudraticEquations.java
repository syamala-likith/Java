package Week5Lab;

public class QudraticEquations 
{
	private int a,b,c;
	void setABC(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	int getA()
	{
		return a;
	}
	int getB()
	{
		return b;
	}
	int getC()
	{
		return c;
	}
	int getDiscriminant()
	{
		return ((b*b)-(4*a*c));
	}
	double getRoot1()
	{
		return (-b+Math.sqrt(getDiscriminant()))/2*a;
	}
	double getRoot2()
	{
		return (-b-Math.sqrt(getDiscriminant()))/2*a;
	}
	public String toString()
	{
		String s=String.format("Discriminant:%d\nRoot-1:%f\nRoot-2:%f",getDiscriminant(),getRoot1(),getRoot2());
		return s;
	}
}
