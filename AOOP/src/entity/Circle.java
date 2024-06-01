package entity;

public class Circle implements Comparable<Circle>{
	private TwoDPoint p;
	private double r;
	
	private Circle() {
		this.p=new TwoDPoint(0,0);
		this.r=0;
	}
	private Circle(TwoDPoint p) {
		this();
		this.p=p;
	}
	public Circle(TwoDPoint p, double r) {
		this(p);
		if(!setRadius(r)) {
			System.out.printf("Cannot set radius with negative value, hence radius set to default %.1f%n",this.r);
		}
	}
	private boolean setRadius(double r) {
		if(r>0) {
			this.r=r; 
			return true;
		}
		return false;
	}
	public double getRadius() {
		return this.r;
	}
	public String getCentre(String s) {
		return p.toString();
	}
	public TwoDPoint getCentre(int x) {
		return p;
	}
	public double calcArea() {
		return Math.PI*Math.pow(r, 2);
	}
	public double calcCircumference() {
		return 2*Math.PI*r;
	}
	public int compareCircles(Circle c) {
		double dist = this.p.getDistance(c.getCentre(0));
		double sum = this.r+c.getRadius();
		double diff = Math.abs(this.r-c.getRadius());
		int result = 0;
		result = (dist>sum)?2:0;
		result = (dist==sum)?1:0;
		result = (dist==diff)?-1:0;
		result = (dist<diff)?-2:0;
		return result;
	}
	public String toString() {
		return String.format("Center: %s%nRadius: %.1f m%nArea: %.1f sq.m%nCircumference: %.1f m%n", this.getCentre(""), this.r, this.calcArea(), this.calcCircumference() );
	}
	
	public int compareTo(Circle c) {
		if (this.r>c.getRadius()) return 1;
		if (this.r<c.getRadius()) return -1;
		return 0;
		
	}
}
