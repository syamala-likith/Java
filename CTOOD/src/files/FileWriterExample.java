package files;
import java.util.*;
import java.io.*;

public class FileWriterExample 
{
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		FileWriter fw=new FileWriter("C:\\Users\\rocky\\Desktop\\JAVA\\CTOOD\\src\\files\\1stexample",true);
		int sno;
		String sname;
		System.out.println("Enetr Sno:");
		sno=sc.nextInt();
		System.out.println("Enter Sname:");
		sc.nextLine();
		sname=sc.nextLine();
		fw.write(Integer.toString(sno)+".");
		fw.write(sname+"\n");
		fw.close();
		sc.close();
		System.out.println("No:"+sno+"\nName:"+sname);
	}
}
