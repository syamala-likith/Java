package Week5Lab;

public class MyTriangle
{
	int s1,s2,s3;
	void setS1(int s1)
	{
		this.s1=s1;
	}
	void setS2(int s2)
	{
		this.s2=s2;
	}
	void setS3(int s3)
	{
		this.s3=s3;
	}
	int getS1()
	{
		return s1;
	}
	int getS2()
	{
		return s2;
	}
	int getS3()
	{
		return s3;
	}
	boolean isValid()
	{
		if(s1==s2 && s2==s3)
		{
			return true;
		}
		else
			return false;
	}
	double area()
	{
		int s;
		double a;
		s=(s1+s2+s3)/2;
		a=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		return a;
	}
}
