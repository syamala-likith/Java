package Practise;

import java.util.*;

public class StudentDemo {

	public static void main(String[] args) 
	{
		int i;
		ArrayList<Student> a=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			int ch;
			System.out.println("1.Add Student Details\n2.Sort By ID\n3.Display\n4.EXIT\nEnter Your Choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
						System.out.println("Enter ID Gendr Name Department");
						a.add(new Student(sc.nextInt(),sc.next(),sc.next(),sc.next()));
						break;
				case 2:
						Collections.sort(a);
						break;
				case 3: 
						for(Student s:a)
						{
							System.out.println(s);
						}
						break;
				case 4:
						System.exit(0);
			}
		}
	}

}
