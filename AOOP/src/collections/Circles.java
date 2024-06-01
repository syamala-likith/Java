package collections;
import java.util.Arrays;

import entity.Circle;

public class Circles {
	private Circle[] circles;
	private int count;
	private final int maxCapacity;
	
	public Circles(int x) {
		this.maxCapacity = (x>0)?x:0;
		circles = new Circle[this.maxCapacity];
		this.count = 0;
	}
	
	public boolean addCircle(Circle c) {
		if(this.count==this.maxCapacity) return false;
		circles[count++] = c;
		return true;
	}
	
	public boolean removeCircle(int index) {
		if(index>=count) return false;
		for(int i=index;i<count-1;i++) circles[i]=circles[i+1];
		count--;
		return true;
	}
	
	public Circle getCircle(int index) {
		if(index>=count) return null;
		return circles[index];
	}
	public boolean isFull() {
		return (count==maxCapacity)?true:false;
	}
	public boolean isEmpty() {
		return (count==0)?true:false;
	}
	
	public void sortCircles() {
		Arrays.sort(circles);
	}
	public String toString() {
		String result = "";
		for(int i=0; i<count; i++) result+=circles[i].toString();
		return result;
	}
	
	
}
