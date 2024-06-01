package Factory_Pattern;

public class Square implements Shape
{
	double s=2;
	@Override
	public void findArea() {
		System.out.println("Square area="+(s*s));
	}

	@Override
	public void findPerimeter() {
		System.out.println("Square perimeter="+(4*s));
	}
}
