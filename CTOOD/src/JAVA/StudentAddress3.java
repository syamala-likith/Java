package JAVA;
import java.util.Scanner;
public class StudentAddress3
{

	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			int n,i;
			System.out.println("Enter the size of a Object array");
			n=sc.nextInt();
			Address3 Aobj[]=new Address3[n];
			Student3 Sobj[]=new Student3[n];
			for(i=0;i<n;i++)
			{
				System.out.println("Enter the names of City,State,Country");
				sc.nextLine();
				Aobj[i]=new Address3(sc.nextLine(),sc.nextLine(),sc.nextLine());
				System.out.println("Enter the Name,Department,ID");
				Sobj[i]=new Student3(sc.nextLine(),sc.nextLine(),sc.nextLong(),Aobj[i]);
			}
			for(i=0;i<n;i++)
			{
				Sobj[i].displayDetailes();
			}
			sc.close();
		}
	}
}
