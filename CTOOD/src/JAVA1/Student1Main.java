package JAVA1;
import java.util.Scanner;
public class Student1Main 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Student1 s=new Student1();
		System.out.println("Enter the 9 digits id number");
		s.setId(sc.nextLong());
		System.out.println("Eneter the branch in CSE,EEE,ME,BT,ECE,ECSE");
		s.setBranch(sc.next());
		System.out.println("Enter the gender either M or F");
		s.setGender(sc.next().charAt(0));
		System.out.println("Eneter the student name");
		s.setName(sc.next());
		System.out.println(s.toString());
		sc.close();
	}

}
