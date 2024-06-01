package SKILLEXAM;

public class Engine 
{
	private int eid,hp;
	private String etype;
	private float eweight;
	Engine(int eid,int hp,String etype,float eweight)
	{
		setEid(eid);
		setHp(hp);
		setEtpye(etype);
		setEweight(eweight);
	}
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	void setEid(int eid)
	{
		this.eid=eid;
	}
	void setHp(int hp)
	{
		this.hp=hp;
	}
	void setEtpye(String etype)
	{
		this.etype=etype;
	}
	void setEweight(float eweight)
	{
		this.eweight=eweight;
	}
	int getEid()
	{
		return eid;
	}
	int getHp()
	{
		return hp;
	}
	String getEtype()
	{
		return etype;
	}
	float getEweight()
	{
		return eweight;
	}
	public String toString()
	{
		String s=String.format("ID:%d\nHourse Power:%d\nEtype:%s\nEweight:%f",getEid(),getHp(),getEtype(),getEweight());
		return s;
	}
}
