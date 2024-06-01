package hashset;

import java.util.HashSet;
import java.util.*;

public class HashSetDemo 
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
		/*System.out.println(hs);
		//remove element from HashSet use remove()*/
		hs.remove(22);
		System.out.println(hs);
		hs2.add(90);
		hs2.add(50);
		//hs2.addAll(hs);
		System.out.println("Unin "+hs2);
		hs2.add(10);
		hs2.add(20);
		hs2.add(30);
		System.out.println(hs2);
		//hs2.retainAll(hs);
		System.out.println("Intersection Elements"+hs2);
		System.out.println(hs2);
		//hs2.removeAll(hs);
		System.out.println("Defference "+hs2);
		hs2.containsAll(hs);
		System.out.println("Subset "+hs2);
		/*hs2.clear();
		System.out.println(hs2);
		/*for(Object h:hs)
		{
			System.out.println(h);
		}*/
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(hs.hashCode());
	}

}
