package by.jonline.four.class07;

public abstract class Logic {
	
	public static double abLength(Triangle triangle) {
		Point a = triangle.getA();
		Point b = triangle.getB();
		return new Line(a, b).lenth();
	}

	public static double bcLength(Triangle triangle) {
		Point b = triangle.getB();
		Point c = triangle.getC();
		return new Line(b, c).lenth();
	}

	public static double acLength(Triangle triangle) {
		Point a = triangle.getA();
		Point c = triangle.getC();
		return new Line(a, c).lenth();
	}
	
	public static double s(Triangle triangle) {
		double ab = abLength(triangle);
		double bc = bcLength(triangle);
		double ac = acLength(triangle);
		double p = p(triangle)/2;
		double s = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
		return s;
	}
	
	public static double p(Triangle triangle) {
		double ab = abLength(triangle);
		double bc = bcLength(triangle);
		double ac = acLength(triangle);
		return ab + bc + ac;
	}
	
	public static Point centroid(Triangle triangle) {
		double x1 = triangle.getA().getX();
		double y1 = triangle.getA().getY();
		double x2 = triangle.getB().getX();
		double y2 = triangle.getB().getY();
		double x3 = triangle.getC().getX();
		double y3 = triangle.getC().getY();
		
		double x4 = (x1 + x2 + x3)/3;
		double y4 = (y1 + y2 + y3)/3;
		
		return new Point(x4, y4);
	}
	
	
	
	

}
