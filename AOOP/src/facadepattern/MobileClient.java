package facadepattern;

public class MobileClient 
{
	public static void main(String args[])
	{
		ShopKeeper s=new ShopKeeper();
		s.iphoneSale();
		s.samsungSale();
		s.blackberrySale();
	}
}