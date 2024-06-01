package Week5Lab;

import java.util.Scanner;

public class Demo 
{

	public static void main(String[] args) 
	{
		boolean loop=true;
		Scanner sc=new Scanner(System.in);
		Department d=new Department();
		int choice;
		while(loop)
		{
			System.out.printf("1.Add new Student\n2.Print details of all Students\n3.Search a Student based on ID\n4.Search a Student based on name\n5.Modify Name based on ID\n6.Exit\n");
			System.out.println("Enter Your Choice:");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
						d.addNewStudent();
						break;
				case 2:
						d.printDetails();
						break;
				case 3:
						System.out.println("Enter a ID to Search");
						if(d.searchStudentId(sc.nextLong()))
						{
							System.out.println("The Student id Found");
						}
						else
						{
							System.out.println("The Student id Not Found");
						}
						break;
				case 4:
						System.out.println("Enter a Name to Search");
						sc.nextLine();
						if(d.searchStudentName(sc.nextLine()))
						{
							System.out.println("The Student Name Found");
						}
						else
						{
							System.out.println("The Student Name Not Found");
						}
						break;
				case 5:
						System.out.println("Enter a ID and Name to Search and Modify the Name");
						sc.nextLine();
						if(d.modifyNameId(sc.nextLine(),sc.nextLong()))
						{
							System.out.println("The Student id Found");
						}
						else
						{
							System.out.println("The Student id Not Found");
						}
						break;
				case 6:
						loop=false;
			}
		}
		sc.close();
	}

}