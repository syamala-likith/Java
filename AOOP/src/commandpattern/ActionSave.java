package commandpattern;

public class ActionSave implements ActionListernerCommand
{
	private Documment doc;
	public ActionSave(Documment doc)
	{
		this.doc=doc;
	}
	@Override
	public void excute() 
	{
		doc.save();
	}

}
