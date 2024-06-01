package PREPARATION;

public class Car implements Vehical
{
	int gare,speed=0;
	public void changeGare(int gare)
	{
		this.gare=gare;
	}
	public void speedUp()
	{
		speed=speed+10;
	}
	public String toString()
	{
		return ("Gare:"+gare+"\nSpeed:"+speed);
	}
}
