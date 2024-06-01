package multithreading;

public class NonSyncDemo 
{

	public static void main(String[] args) 
	{
		SynchronisedThread d=new SynchronisedThread();
		NonSyncMyThread t1=new NonSyncMyThread(d,"Dhoni");
		NonSyncMyThread t2=new NonSyncMyThread(d,"YuvRaj");
		t1.start();
		t2.start();
	}

}
