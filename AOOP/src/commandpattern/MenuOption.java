package commandpattern;

public class MenuOption 
{
	private ActionListernerCommand openCommand;
	private ActionListernerCommand saveCommand;
	void clickOpen()
	{
		System.out.println("Document Opened");
	}
	void clickSave()
	{
		System.out.println("Document Saved");
	}
	MenuOption(ActionListernerCommand openCommand,ActionListernerCommand saveCommand)
	{
		this.openCommand=openCommand;
		this.saveCommand=saveCommand;
	}
}