package lab_2;

public class Password 
{
	public static boolean passwordLength(String pass)
	{
		if(pass.length()>=5 && pass.length()<=10)
		{
			return true;
		}
		return false;
	}
}
