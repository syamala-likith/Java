package PREPARATION;
import java.util.*;
import java.io.*;
public class Car1Demo 
{

	public static void main(String[] args) throws IOException
	{
		int i=0;
		File fr=new File("C:\\Users\\rocky\\Desktop\\JAVA\\EXAMPREPARATION\\src\\PREPARATION\\Car1Input");
		FileWriter fw=new FileWriter("C:\\Users\\rocky\\Desktop\\JAVA\\EXAMPREPARATION\\src\\PREPARATION\\Car1Output",true);
		Scanner sc=new Scanner(fr);
		Car1 c[]=new Car1[3];
		Car1 c1=new Car1();
		while(sc.hasNext())
		{
			c[i]=new Car1();
			c[i].setNM(sc.next(),sc.next());
			fw.write(c[i].toString());
			i++;
		}
		for(int j=0;j<i;j++)
		{
			System.out.println(c[j]);
		}
		fw.close();
	}

}
