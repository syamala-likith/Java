package maps;

import java.util.*;

public class mapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m=new HashMap();
		Map m2=new HashMap();
		m.put("Name","LIkith");
		m.put("age",18);
		System.out.println(m);
		m.remove("age");
		System.out.println(m);
		System.out.println(m.hashCode());
		System.out.println(m.isEmpty());
		m.clear();
		System.out.println(m);
		m.put("Name","LIkith");
		m.put("age",18);
		System.out.println(m);
		m2.put("N","Chandana");
		m2.put("a",19);
		System.out.println(m2);
		m.putAll(m2);
		System.out.println(m);
	}

}
