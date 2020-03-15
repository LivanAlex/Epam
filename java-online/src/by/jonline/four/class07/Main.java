package by.jonline.four.class07;

import static by.jonline.four.class07.Logic.*;

/*
 * 7. Описать класс, представляющий треугольник.
 * Предусмотреть методы для создания объектов,
 * вычисления площади, периметра и точки пересечения медиан.
 */

public class Main {

	public static void main(String[] args) {
		Point a = new Point(0,0);
		Point b = new Point(10,0);
		Point c = new Point(0,10);
		
		
		Triangle one = new Triangle(a, b, c);
		
		double s = s(one);
		
		double p = p(one);
		
		Point centroid = centroid(one);
		
		System.out.format("Площадь треугольника: %.2f\n",s);
		System.out.format("Периметр треугольника: %.2f\n",p);
		System.out.format("Точки пересечения медиан: x = %.2f; y = %.2f;\n", centroid.getX(), centroid.getY());

	}

	

	

	

}
