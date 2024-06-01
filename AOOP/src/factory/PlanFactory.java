package factory;

public class PlanFactory 
{
	public Plan getInstance(String s)
	{
		if(s.equalsIgnoreCase("domastic"))
		{
			return new DomasticPlan();
		}
		else if(s.equalsIgnoreCase("institutional"))
		{
			return new InstitutionalPlan();
		}
		else if(s.equalsIgnoreCase("commercial"))
		{
			return new CommercialPlan();
		}
		else 
		{
			return null;
		}
	}
}
