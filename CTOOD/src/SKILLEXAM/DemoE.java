package SKILLEXAM;
import java.util.*;
public class DemoE {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Engine e=new Engine(sc.nextInt(),sc.nextInt(),sc.next(),sc.nextFloat());
		Engine e1=new Engine();
		e1.setEid(sc.nextInt());
		e1.setHp(sc.nextInt());
		e1.setEtpye(sc.next());
		e1.setEweight(sc.nextFloat());
		System.out.println(e.toString());
		System.out.println(e1.toString());
	}

}
