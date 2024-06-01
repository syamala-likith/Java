package multithreading;

public class NonSyncMyThread extends Thread
{
	SynchronisedThread d;
	String name;
	NonSyncMyThread(SynchronisedThread d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
