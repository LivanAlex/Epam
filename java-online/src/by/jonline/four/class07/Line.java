package by.jonline.four.class07;

public class Line {
	
	private Point a;
	private Point b;
	
	public Line(Point a, Point b) {
		
		this.a = a;
		this.b = b;

	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}
	
	/** Returns lenth of line */
	public double lenth() {
		double x1 = a.getX();
		double x2 = b.getX();
		double y1 = a.getY();
		double y2 = b.getY();
		
		return Math.sqrt(Math.pow((x2 - x1), 2)+Math.pow((y2 - y1), 2));
	}

	
	
	
	
	
	

}
