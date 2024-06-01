package Week7;

public class A extends Marks
{
	double a, b;
	A(double a,double b)
	{
		getPercentage(a,b);
	}
	void getPercentage(double a,double b)
	{
		System.out.println(((a+b)/200)*100);
	}

}
