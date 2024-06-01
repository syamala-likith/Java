package PREPARATION;
import java.util.*;
public class EmployeeDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee> e=new ArrayList<>();
		int ch;
		while(true)
		{
			System.out.println("1.Add Details\n2.Sort By Id\n3.Sort By Name\n4.Display\n5.EXIT\nEnter Your Choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				e.add(new Employee(sc.next(),sc.next(),sc.nextLong(),sc.nextFloat()));
				break;
			case 2:
				Collections.sort(e,new SortByIdEmployee());
				break;
			case 3:
				Collections.sort(e,new SortByNameEmployee());
				break;
			case 4:
				for(Employee e1:e)
				{
					System.out.println(e1.toString());
				}
				break;
			case 5:
				System.exit(0);
			}
		}
	}

}
