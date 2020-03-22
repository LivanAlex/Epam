package by.jonline.two.array;

import by.jonline.four.class07.Point;
import by.jonline.two.array.helper.Generator;

/*
 * 4. На плоскости заданы своими координатами n точек.
 * Написать метод(методы), определяющие, между какими из пар точек
 * самое большое расстояние. Указание. Координаты точек занести в массив.
 */

public class Decomposition04 {
	
	public static void main(String[] args) {
		
		Point [] coordinate;
		Point [] longestSegment;
		final String MESSAGE;
		final String LONGEST;
		double max;
		
		MESSAGE = "Среди координат:";
		LONGEST = "Самое большое расстояние равное: %.2f\n"
				+ "находится между точками c координатами:\n";
		coordinate = new Point [8];
		
		randomFill(coordinate);
		
		System.out.println(MESSAGE);
		
		print(coordinate);
		
		longestSegment = findLongestSegment(coordinate);
		
		max = findSegment(longestSegment[0],longestSegment[1]);
		
		System.out.format(LONGEST, max);

		print(longestSegment);
		
	}
	
	
	
	private static void randomFill(Point[] coordinate) {
		for (int i = 0; i < coordinate.length; i++) {
			double x;
			double y;
			
			x = Generator.randomDouble(-20, 20);
			y = Generator.randomDouble(-20, 20);
			
			coordinate[i] = new Point(x, y);
		}
		
	}


	
	private static double findSegment (Point a, Point b) {
		
		double x1;
		double y1;
		double x2;
		double y2;
		double lengh;
		
		x1 = a.getX();
		y1 = a.getY();
		x2 = b.getX();
		y2 = b.getY();
		
		lengh = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		return lengh;
	}
	
	
	
	private static Point[] findLongestSegment (Point [] array) {
		double max;
		Point [] longestSegment;
		
		max = Double.MIN_VALUE;
		longestSegment = new Point [2];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				
				Point a;
				Point b;
				double temp;
				
				a = array[i];
				b = array[j];
				temp = findSegment(a,b);
				
				if (temp > max) {
					max = temp;
					longestSegment[0] = a;
					longestSegment[1] = b;
				}
				
			}
		}
	
		return longestSegment;
	}
	
	
	
	public static void print(Point [] array){
		
		for (Point i : array) {
			double x;
			double y;
			
			x = i.getX();
			y = i.getY();
			
			System.out.format("x = %6.2f; y = %6.2f;\n", x, y);
		}
	}

}
