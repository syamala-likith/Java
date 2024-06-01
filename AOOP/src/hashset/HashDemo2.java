package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashDemo2 
{

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		HashSet hs2=new HashSet();
		hs.add(22); //to add elements
		hs.add(50);
		hs.add("jg");
		hs.add(50);
		hs.add(200);
		hs.add("li");
		hs.add(90);
		System.out.println(hs.hashCode());
		System.out.println(hs);
		hs2.add(50);
		System.out.println(hs.containsAll(hs2));
		System.out.println(hs);

	}

}
