package aoop;

public abstract class A 
{
	int a,b;
	void setA(int a)
	{
		this.a=a;
	}
	void setB(int b)
	{
		this.b=b;
	}
	int getA()
	{
		return a;
	}
	int getB()
	{
		return b;
	}
	abstract void add(int a,int b);

	
}
