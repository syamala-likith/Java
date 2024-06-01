package SKILLEXAM;
import java.util.*;


public class MyTriangle 
{
	private int s,s1,s2,s3;
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
	void isValid()
	{
		if(getS1()>0 && getS2()>0 && getS3()>0)
		{
			area();
		}
		else
		{
			System.out.println("InValid");
		}
	}
	void area()
	{
		s=(s1+s2+s3)/3;
		System.out.println("Area Of Triangle:"+Math.sqrt((s*(s-s1)*(s-s2)*(s-s3))));
	}
}
