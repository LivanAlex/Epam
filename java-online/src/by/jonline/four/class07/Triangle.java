package by.jonline.four.class07;


/**
 * 7. Описать класс, представляющий треугольник.
 * Предусмотреть методы для создания объектов,
 * вычисления площади, периметра и точки пересечения медиан.
 */

public class Triangle {
	
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		
		this.a = a;
		this.b = b;
		this.c = c;

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

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}


}
