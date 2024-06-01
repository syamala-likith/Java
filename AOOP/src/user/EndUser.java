package user;
import java.util.Scanner;
import collections.Circles;
import entity.*;

public class EndUser {
	private static Scanner sc = new Scanner(System.in);
	private static Circles circleColl1=null;

	public static void main(String[] args) {
		boolean repeat = true;
		int choice=0;
		while(repeat) {
			choice = mainMenu();
			switch(choice) {
			case 1: createCollection(); break;
			case 2: addCircle();break;
		//	case 3: getCircle();break;
		//	case 4: removeCircle();break;
			case 5: sortCircles();break;
			case 6: displayCircles();break;
			default: repeat=false;
			}
		}
		System.out.println("Good Bye!");

	}
	
	private static void displayCircles() {
		if(circleColl1==null) {
			System.out.println("You must intitially choose option 1");
			return;
		}
		if(circleColl1.isEmpty()) {
			System.out.println("There are no circles in the collection to display");
			return;
		}
		System.out.println(circleColl1.toString());
	}
	
	private static void sortCircles() {
		if(circleColl1==null) {
			System.out.println("You must intitially choose option 1");
			return;
		}
		if(circleColl1.isEmpty()) {
			System.out.println("There are no circles in the collection to display");
			return;
		}
		circleColl1.sortCircles();
	}
	private static void addCircle() {
		if(circleColl1==null) {
			System.out.println("You must intitially choose option 1");
			return;
		}
		if(circleColl1.isFull()) {
			System.out.println("The collection is full, we cannot add any more circles. Remove some of them to add new ones");
			return;
		}
		System.out.println("Enter the x and y coordinates of the centre of the circle");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		System.out.println("Enter the radius of the circle in meters");
		double r = sc.nextDouble();
		circleColl1.addCircle(new Circle(new TwoDPoint(x,y),r));
	}
	private static void createCollection() {
		if(circleColl1==null) {
		System.out.println("Enter Max number of Circles to be stored");
		int maxCap = sc.nextInt();
		if(maxCap>0) circleColl1 = new Circles(maxCap);
		System.out.println("Successfully created collection");
		return;
		}
		System.out.println("Collection already created.");
	}
	
	private static int mainMenu() {
		System.out.println("1. Create a collection that can store circles");
		System.out.println("2. Add circle");
		System.out.println("3. Get circle");
		System.out.println("4. Remove circle");
		System.out.println("5. Sort circles");
		System.out.println("6. Display all circles in a collection");
		System.out.println("Any other number to exit");
		return sc.nextInt();
	}

}
