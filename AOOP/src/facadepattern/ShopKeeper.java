package facadepattern;

public class ShopKeeper 
{
	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop blackberry;
	public ShopKeeper()
	{
		iphone=new Iphone();
		samsung=new Samsung();
		blackberry=new BlackBerry();
	}
	public void iphoneSale()
	{
		iphone.mobileNo();
		iphone.price();
	}
	public void samsungSale()
	{
		samsung.mobileNo();
		samsung.price();
	}
	public void blackberrySale()
	{
		blackberry.mobileNo();
		blackberry.price();
	}
}
