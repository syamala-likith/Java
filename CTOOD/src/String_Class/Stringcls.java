package String_Class;

public class Stringcls 
{
	public static void main(String[] args) 
	{
		String s="Welcome to KL university cse";
		String s1="CSE";
		String s2="cse"; 
		System.out.println(s.charAt(11));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s.concat(s1));
		System.out.println(s.contains(s1));
		String s3=String.join("-", "I","am","in","S5");
		System.out.println(s3);
		System.out.println(s.replace("cse", "ECE"));
		System.out.println(s.substring(14));
		System.out.println(s.substring(14, 24));
		System.out.println(s.indexOf("u"));
		System.out.println(s2.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s.endsWith(s2));
		System.out.println(s.startsWith("W"));
		
		
		
		
	}

}
