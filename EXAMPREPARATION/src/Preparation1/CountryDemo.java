package Preparation1;

import PREPARATION.Country;
import java.util.*;
import java.io.*;

public class CountryDemo
{

	public static void main(String[] args) throws IOException 
	{
		Country c[]=new Country[5];
		int i=0;
		FileWriter fw=new FileWriter("C:\\Users\\rocky\\Desktop\\JAVA\\EXAMPREPARATION\\src\\PREPARATION\\CountryOutput");
		Scanner sc=new Scanner(System.in);
		for(int j=0;j<5;j++)
		{
			c[j]=new Country();
			c[j].setNCP(sc.next(), sc.next(), sc.nextInt());
			fw.write(c[j].toString()+"\n");
		}
		fw.close();
	}

}
