package files;
import java.io.*;
import java.util.*;
public class Demo {
	public static void main(String[] args) throws IOException
	{
		Cuboid c=new Cuboid();
		File fr=new File("C:\\Users\\rocky\\Desktop\\JAVA\\CTOOD\\src\\files\\input-cuboid");
		FileWriter fw=new FileWriter("C:\\Users\\rocky\\Desktop\\JAVA\\CTOOD\\src\\files\\output-cuboid");
		Scanner sc=new Scanner(fr);
		while(sc.hasNext())
		{
			c.l=sc.nextDouble();
			c.b=sc.nextDouble();
			c.h=sc.nextDouble();
			fw.write("Lenght:"+c.l+"\nBreadth:"+c.b+"\nHeight:"+c.h+"\nVolmue:"+c.findVolume()+"\n\n");
		}
		sc.close();
		fw.close();
	}
}
