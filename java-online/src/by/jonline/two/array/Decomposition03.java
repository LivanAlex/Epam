package by.jonline.two.array;

import java.util.Scanner;

/*
 * 3. Вычислить площадь правильного шестиугольника со стороной а,
 * используя метод вычисления площади треугольника.
 */

public class Decomposition03 {

	public static void main(String[] args) {
		
		double side;
		double hexagonArea;
		final String MESSAGE;
		final String OUT;
		
		MESSAGE = "Введите длину стороны правильного шестиугольника:";
		OUT = "Площадь правильного шестиуголника со стороной %.2f равна: %.2f";
		System.out.println(MESSAGE);
		side = intFromUser();

		hexagonArea = findHexagonArea(side);
		
		System.out.printf(OUT, side, hexagonArea);
	}
	
	
	
	private static double findHexagonArea(double side) {
		double sOfHexagon;
		sOfHexagon = findRightTriangleArea(side) * 6;
		return sOfHexagon;
	}




	private static double findRightTriangleArea(double a){
		return Math.sqrt(3)/4 * a * a;
	}
	
	
	
	
	private static void errorMessage() {
		final String ERROR;
		ERROR = "Вы допустили ошибку при вводе данных, попробуйте еще раз:";
		System.out.println(ERROR);
		
	}
	
	
	
	private static int intFromUser(){
		Scanner s = new Scanner(System.in);
		int out;
		while (!s.hasNextInt()) {
			s.next();
			errorMessage();
		}
		
		out = s.nextInt();
		
		if (out > 0) {
			return out;
		} else {
			errorMessage();
			return intFromUser();
		}
	}
	
}
