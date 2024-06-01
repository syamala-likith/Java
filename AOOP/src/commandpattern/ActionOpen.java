package commandpattern;

public class ActionOpen implements ActionListernerCommand
{
	private Documment doc;
	public ActionOpen(Documment doc)
	{
		this.doc=doc;
	}
	@Override
	public void excute() 
	{
		doc.open();
	}
}
