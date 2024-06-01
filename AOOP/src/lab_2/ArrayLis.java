package lab_2;
import java.util.*;
public class ArrayLis 
{
	public static void main(String args[])
	{
		Collection a=new ArrayList();
		a.add("Likith");
		a.add(20);
		for(int i=0;i<a.size();i++)
		{
			System.out.println(((ArrayList) a).get(i));
		}
		String s=String.valueOf(10);
		System.out.println(s);
	
	}
}