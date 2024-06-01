package genericsinterface;

public class GClint 
{
	public static void main(String[] args) 
	{
		GClassImplimentation1<Integer> g=new GClassImplimentation1();
		g.setVale(1000);
		System.out.println(g.getValue());
	}
}
