package Factory_Pattern;

public class Rectangle implements Shape
{
	double l=2,b=4;
	public void findArea() {
		System.out.println("Rectangle area="+(l*b));
	}

	public void findPerimeter() {
		System.out.println("Rectangle perimeter="+2*(l+b));
	}
	
}
