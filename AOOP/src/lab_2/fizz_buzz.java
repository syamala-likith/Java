package lab_2;

public class fizz_buzz 
{
	public static String fizzBuzz(int a)
	{
		if(a%3==0 && a%5==0)
		{
			return "FizzBuzz";
		}
		else if(a%3==0)
		{
			return "Fizz";
		}
		else if(a%5==0)
		{
			return "Buzz";
		}
		else
		{
			return a+"";
		}
	}
	public static void main(String ards[])
	{
		for(int i=1;i<=100;i++)
		{
			if(i!=100)
			{
				System.out.print(fizzBuzz(i)+", ");
			}
			else 
			{
				System.out.print(fizzBuzz(i));
			}
		}
	}
}
