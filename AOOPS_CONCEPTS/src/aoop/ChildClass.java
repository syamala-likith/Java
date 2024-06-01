package aoop;

public class ChildClass implements ParentInterface{

	public static void main(String[] args) 
	{
		ChildClass c=new ChildClass();
		c.sum(10, 20);
	}

	@Override
	public void sum(int a, int b) 
	{
		System.out.println(a+b);
	}

}
