package PREPARATION;

public class CricketPlayer 
{
	private String name,country;
	private int numberofruns;
	void setNameCountryNomberofplayers(String name,String country,int n)
	{
		this.country=country;
		this.name=name;
		this.numberofruns=n;
	}
	String getCountry()
	{
		return country;
	}
	public String toString()
	{
		return ("Name:"+name+" Country:"+country+"Number Of Players:"+numberofruns);
	}
}
