package JAVA;

public class Car 
{
	String colour,model;
	int yom,seats;
	Engien a;
	Car(String colour,String model,int yom,int seats,String type,int cc,int chesse)
	{
		this.colour=colour;
		this.model=model;
		this.yom=yom;
		this.seats=seats;
		a=new Engien(type,cc,chesse);
		//System.out.println(a.toString());
	}
	/*String setEngien(String type,int cc,int chesse)
	{
		Engien e=new Engien(type,cc,chesse);
		return e.toString();
	}*/
	public String toString()
	{
		String s=String.format("Car colour:%s\nCar model:%s\nCar YOM:%d\nCar number of seats:%d",colour,model,yom,seats);
		return s+a.toString();
	}
}
