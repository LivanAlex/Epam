package by.jonline.two.array;

import by.jonline.two.array.helper.Out;

/*
 * Сформировать квадратную матрицу порядка N по правилу:
 * A[I,J]=Math.sin((Math.pov(2,i)-Math.pov(2,j))/N)
 * и подсчитать количество положительных элементов в ней.
 */

public class MultiArray07 {

	public static void main(String[] args) {
		
		int n = 7; // порядок N
		double arr [][];
		int counter;
		final String MESSAGE;
		final String POSITIVE;
		final String NON;
		
		
		arr = new double [n][n];
		counter = 0;
		MESSAGE = "В матрице:";
		POSITIVE = "%d положительных элементов%n";
		NON = "нет положительных элементов";
		
		
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				arr[i][j] = fill(i,j,n);
				if (arr[i][j] > 0){
					counter++;
				}
			}
		}
		
		
		System.out.println(MESSAGE);
		
		Out.printWithSpaces(arr, 2);
		
		if (counter != 0){
			System.out.printf(POSITIVE, counter);
		} else {
			System.out.printf(NON);
		}
	}
	
	
	public static double fill(int i, int j, int n) {
		double result;
		result = Math.sin((Math.pow(i,2)-Math.pow(j,2))/n);
		return result;
	}

}
