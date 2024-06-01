package insemlabexam;

public class main 
{
	
	static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod)
    {
		
        if (n == 1)
        {
        	
	        System.out.println("Disk 1 moved from rod " +  from_rod + " to rod " + to_rod);
	        return;
	    }
	    towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
	    System.out.println("Disk " + n + " moved from rod " +  from_rod + " to rod " + to_rod);
	    towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
	}
	     
	public static void main(String[] args)
	{
		int n = 3;
        towerOfHanoi(n, 'A', 'C', 'B'); 
	}

}
