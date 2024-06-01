package multithreading;

public class SynchronisedThread 
{
	public void wish(String name)
	//public synchronized void wish(String name)
	{
		for(int i=0;i<5;i++)
		{
			//This for loop is non synchronized block
			//The String in the print statement is for next for loop to show that block is Synchronized
			System.out.println("This is Synchronized Block");
		}
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{
				System.out.print("Good Morning ");
				try
				{
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{}
				System.out.println(name);
			}
		}
	}
}
