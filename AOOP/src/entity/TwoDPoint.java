package entity;

public class TwoDPoint {
	private double x,y;
	
	private TwoDPoint() {
		this.x=this.y=0;
	}
	public TwoDPoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	double getX() {
		return this.x;
	}
	double getY() {
		return this.y;
	}
	int getQuadrant() {
		int quad=0;
		quad = (this.x>0 && this.y>0)?1:0;
		quad = (this.x<0 && this.y>0)?2:0;
		quad = (this.x<0 && this.y<0)?3:0;
		quad = (this.x>0 && this.y>0)?4:0;
		return quad;
	}
	
	double getDistance(TwoDPoint p) {
		return Math.sqrt(Math.pow(p.getX()-this.x,2)+Math.pow(p.getY()-this.y,2));
	}
	
	boolean formsTriangle(TwoDPoint p1, TwoDPoint p2) {
		boolean result = false;
		result = (this.getDistance(p1)+this.getDistance(p2)>p1.getDistance(p2))?true:false;
		result = (this.getDistance(p2)+p2.getDistance(p1)>this.getDistance(p1))?true:false;
		result = (this.getDistance(p1)+p2.getDistance(p1)>this.getDistance(p2))?true:false;
		return result;
	}
	public String toString() {
		return String.format("(%.1f,%.1f)",this.x, this.y);
	}
}
