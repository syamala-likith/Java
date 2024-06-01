package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Student 
{
	long id;
	String name,dept,gender;
	int age;
	Student(long id ,String name,String dept ,String gender, int age)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.gender=gender;
		this.age=age;
	}
	public String toString()
	{
		return ("ID:"+id+"Name:"+name+"Department:"+dept+"Gender:"+gender+"Age:"+age);
	}
	public static void main(String args[]) throws Exception
	{
		File fr=new File("C:\\Users\\rocky\\Desktop\\JAVA\\CTOOD\\src\\files\\Inputs");
		FileWriter fw=new FileWriter("C:\\Users\\rocky\\Desktop\\JAVA\\CTOOD\\src\\files\\Outputs",true);
		Scanner sc=new Scanner(fr);
		while(sc.hasNext())
		{
			Student s=new Student(sc.nextLong(),sc.next(),sc.next(),sc.next(),sc.nextInt());
			fw.write(s.toString());
		}
	}
}
