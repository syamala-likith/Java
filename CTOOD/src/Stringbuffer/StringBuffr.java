package Stringbuffer;
public class StringBuffr 
{
	public static void main(String[] args) 
	{
		StringBuffer s=new StringBuffer("Java");
		StringBuffer s1=new StringBuffer(" CSE");
		System.out.println(s);
		s.append(s1);
		System.out.println(s);
		s.insert(5, "for ");
		System.out.println(s);
		s.replace(5, 7, "KL University"); // s.replace(sindex,lindex-1,str);
		System.out.println(s);
		s.delete(5, 19);
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(6));
		System.out.println(s.substring(6,9));
		System.out.println(s1);
		System.out.println(s1.reverse());
	}

}
