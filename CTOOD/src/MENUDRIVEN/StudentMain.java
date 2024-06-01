package MENUDRIVEN;

import java.util.Scanner;
public class StudentMain 
{
	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			int i,ch,m,size=0,n;
			String nam;
			long d;
			System.out.println("Enter maximum number of student details to enter");
			n=sc.nextInt();
			Student s[]=new Student[n];
			for(i=0; i<n; i++)
			{
				s[i]=new Student();
			}// Student s=new Student();
			boolean loop=true;
			while(loop)
			{
				System.out.printf("1.Add Student\n2.Search by Id\n3.Search by name\n4.Sort by Id\n5.Sort by marks\n6.update name by Id\n7.Display");
				System.out.printf("\nEnter your choice:");
				ch=sc.nextInt();
				switch(ch)
				{
				case 1: 
						System.out.println("Enter the Name:");
						sc.nextLine();
						nam=sc.nextLine();
						System.out.println("Enter student ID:");
						d=sc.nextLong();
						System.out.println("Enter total marks:");
						m=sc.nextInt();
						s[size].addStudent(nam, d, m);
						size=size+1;
						break;
				case 2:
						System.out.println("Enter the ID to Search:");
						d=sc.nextLong();
						if(Student.searchById(s, size, d))
							System.out.println("ID is found");
						else
							System.out.println("ID is not Found");
						break;
				case 3:
						System.out.println("Enter name to search:");
						sc.nextLine();
						nam=sc.nextLine();
						if(Student.searchByName(s, size, nam))
							System.out.println("Name is Found");
						else
							System.out.println("Name is not Found");
						break;
				case 4:
						Student.sortById(s, size);
						break;
				case 5:
						Student.sortByMarks(s, size);
						break;
				case 6:
						System.out.println("Enter id Number to update name:");
						d=sc.nextLong();
						System.out.println("Enter name to update:");
						sc.nextLine();
						nam=sc.nextLine();
						if(Student.updateNameById(s, size, d, nam))
							System.out.println("Name is Updated");
						else
							System.out.println("Id number not found");
						break;
				case 7:
					for(i=0; i< size; i++)
					{
						System.out.println(s[i]);
					}
					break;
					default:
						loop=false;
						
				}
			}
			sc.close();
		}
	}

}