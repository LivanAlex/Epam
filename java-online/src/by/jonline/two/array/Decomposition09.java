package by.jonline.two.array;

/**
 * 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника.
 * Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.

 */

public class Decomposition09 {

	public static void main(String[] args) {
		
		double x;
		double y;	
		double z;
		double t;
		double area;
		final String OUT;
		
		x = 4;
		y = 5;	
		z = 7;
		t = 3;
		OUT = "У четырехугольника со соторами: %.2f %.2f %.2f %.2f\n"
				+ "площадь равна %.2f";
		area = quadrilateralArea(x,y,z,t);
		
		System.out.format(OUT, x, y, z, t, area);

	}
	
	private static double quadrilateralArea (double side1, double side2, double side3, double side4) {
		double p = quadrilateralPerimeter(side1, side2, side3, side4)/2;
		return  Math.sqrt((p-side1)*(p-side2)*(p-side3)*(p-side4));
	}
	
	private static double quadrilateralPerimeter (double side1, double side2, double side3, double side4) {
		return  side1+side2+side3+side4;
	}

}
