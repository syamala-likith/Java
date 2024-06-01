package JAVA1;

public class Address2
{
	String city,state,country;
	void setCity(String city)
	{
		this.city=city;
	}
	void setState(String state)
	{
		this.state=state;
	}
	void setCountry(String country)
	{
		this.country=country;
	}
	String getCity()
	{
		return city;
	}
	String getState()
	{
		return state;
	}
	String getCountry()
	{
		return country;
	}
	public String toString()
	{
		String s=String.format("City:%s\nState:%s\nCountry:%s",getCity(),getState(),getCountry());
		return s;
	}
}
