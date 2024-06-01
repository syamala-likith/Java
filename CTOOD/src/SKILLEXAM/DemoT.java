package SKILLEXAM;
import java.util.*;
public class DemoT 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		MyTriangle t=new MyTriangle();
		System.out.println("Enter Side-1");
		t.setS1(sc.nextInt());
		System.out.println("Enter Side-2");
		t.setS2(sc.nextInt());
		System.out.println("Enter Side-3");
		t.setS3(sc.nextInt());
		t.isValid();
		sc.close();
	}

}
