package PREPARATION;
import java.util.*;
public class StudentDemo {

	public static void main(String[] args) {
		ArrayList<Student> s=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		boolean loop=true;
		int ch;
		while(loop)
		{
			System.out.println("1.ADD STUDENT DETAILS\n2.SORT BY HEIGHT\n3.SORT BY WEIGHT\n4.SORT BY NAME\n5.DISPLAY\n6.EXIT");
			System.out.println("Enter yout choice :");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter ID,name,age,height,weight");
				   s.add(new Student(sc.nextLong(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble()));
			        break;
			case 2:Collections.sort(s);
			       break;
			case 3:Collections.sort(s,new SortbyWeight());
			      break;
			case 4:Collections.sort(s,new SortbyName());
			       break;
			case 5:for(Student s1:s)
			       {
				     System.out.println(s1.toString());
			       }
			       break;
			case 6:System.exit(0);
			}
		}

	}

}