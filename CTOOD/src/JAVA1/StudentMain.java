package JAVA1;
import java.util.Scanner;
public class StudentMain 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("Enter the 9 digits id number");
		s.setId(sc.nextLong());
		System.out.println("Eneter the branch in CSE,EEE,ME,BT,ECE,ECSE");
		s.setBranch(sc.next());
		System.out.println("Enter the gender either M or F");
		s.setGender(sc.next().charAt(0));
		System.out.println("Eneter the student name");
		s.setName(sc.next());
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getGender());
		System.out.println(s.getBranch());
		sc.close();
	}

}
