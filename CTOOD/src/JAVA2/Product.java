package JAVA2;

public class Product 
{
	int id;
	String name;
	int warrenty;
	float price;
	public Product(int id, String name, int warrenty, float price) 
	{
		this.id = id;
		this.name = name;
		this.warrenty = warrenty;
		this.price = price;
	}
	@Override
	public String toString() 
	{	
		return "Id:"+id+"\nName:"+name+"\nWarrenty:"+warrenty+"\nPrice:"+price;
	}
	
	
}
