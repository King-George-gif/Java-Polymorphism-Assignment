package answer;

abstract class Shape{
	private String color;
	public abstract double getArea();
	public abstract String toString();
}

class Rectangle extends Shape{
	private int length;
	private int width;
	

	public double getArea() {
		double area = (this.length * this.width);
		return area;
	}
	
	public String toString() {
		return null;
	}
	
}


class Triangle extends Shape{
	private int base;
	private int height;
	

	public double getArea() {
		double area = (this.base * this.height)/2;
		return area;
	}
	
	public String toString() {
		return null;
	}
	
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
