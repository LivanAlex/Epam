package by.jonline.two.array;

import by.jonline.two.array.helper.Generator;
import by.jonline.two.array.helper.Out;

/*
 * 5. Составить программу, которая в массиве A[N] находит второе по величине число
 * (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
 */

public class Decomposition05 {

	public static void main(String[] args) {
		int n;
		int [] arr;
		final String MESSAGE;
		
		n = 9;
		arr = new int [n];
		MESSAGE = "\nчисло, которое меньше максимального элемента массива, "
				+ "но больше всех других элементов: %d";
		
		Generator.fill(arr, 0, 9);
		
		int secondMax = findSecondMax(arr);
		Out.print(arr);

		System.out.printf(MESSAGE, secondMax);
	}

	
	private static int findSecondMax(int [] array) {
		int max = findMax(array);
		int secondMax = Integer.MIN_VALUE;
		for (int i : array) {
			secondMax = secondMax < i && i != max ? i : secondMax;
		}
		return secondMax;
	}
	
	
	
	private static int findMax(int [] array) {   
		int max = Integer.MIN_VALUE;
		for (int i : array) {
			max = max < i ? i : max;
		}
		return max;
	}
	
	

}
