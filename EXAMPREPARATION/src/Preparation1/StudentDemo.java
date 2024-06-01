package Preparation1;

import java.util.*;

public class StudentDemo 
{

	public static void main(String[] args)
	{
		ArrayList<Student> s=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		int ch;
		while(true)
		{
			System.out.println("1.Add Details\n2.Sort By Height\n3.Sort By Weight\n4,Display\n5.EXIT\nEnetr Your Choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Name,Id,Weight,Height,Age");
				s.add(new Student(sc.next(),sc.nextLong(),sc.nextDouble(),sc.nextDouble(),sc.nextInt()));
				break;
			case 2:
				Collections.sort(s);
				break;
			case 3:
				Collections.sort(s,new SortByWeight());
				break;
			case 4:
				for(Student s1:s)
				{
					System.out.println(s1.toString());
				}
				break;
			case 5:
				System.exit(0);
			}	
		}
	}

}
