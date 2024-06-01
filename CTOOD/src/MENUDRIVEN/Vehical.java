package MENUDRIVEN;

public class Vehical 
{
	long num;
	int vw;
	public String name,vn;
	public Vehical(String name,String vn,int vw,long num)
	{
		this.name=name;
		this.num=num;
		this.vn=vn;
		if(setVW(vw))
		{
		}
		else
		{
			System.out.println("Entere a correct wheeler 6 or 4");
		}
	}
	boolean setVW(int vw)
	{
		if(vw==4 || vw==6)
		{
			this.vw=vw;
			return true;
		}
		else
		{
			return false;
		}
	}
	int getVW()
	{
		return vw;
	}
	public String toString()
	{
		String s=String.format("\nOwner Name:%s\nMobile Number:%d\nVehical Number:%s\nWheeler:%d\n",name,num,vn,getVW());
		return s;
	}
}
