package by.jonline.two.array;

import by.jonline.two.array.helper.Generator;
import by.jonline.two.array.helper.Out;

/*
 * Даны действительные числа а1 ,а2 ,..., аn .
 * Поменять местами наибольший и наименьший элементы.
 */

public abstract class Arrays04 {
	

	public static void main(String[] args) {
		
		double [] arr;
		
		arr = Generator.randomDoubleArray(10, -100, 100);
		
		Out.printWithSpaces(arr, 2);

		
		replaceMaxMin(arr);
		
		
		Out.printWithSpaces(arr, 2);
	}
	
	
	private static void replaceMaxMin (double [] array) {
		
		double max;
		double min;
		
		int maxIndex;
		int minIndex;
		
		max = Double.NEGATIVE_INFINITY;
		min = Double.POSITIVE_INFINITY;
		maxIndex = 0;
		minIndex = 0;
		
		for (int i = 0; i < array.length; i++){
			if (array[i] > max){
				max = array[i];
				maxIndex = i;
			}
			if (array[i] < min){
				min = array[i];
				minIndex = i;
			}
		}
		
		array[maxIndex] = min;
		array[minIndex] = max;
	}
}
