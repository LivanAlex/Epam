package by.jonline.two.array;

import by.jonline.two.array.helper.Generator;
import by.jonline.two.array.helper.Out;

/*
 * 9. Задана матрица неотрицательных чисел.
 * Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит максимальную сумму.
 */

public class MultiArray09 {
	

	public static void main(String[] args) {
		
		int [][] arr;
		int sumOfRow [];
		int max;
		int [] maxIndex;
		final String MESSAGE;
		final String ROW;
		final String ROWS;
		final String MAX;
		
		MESSAGE = "Сумма рядов:";
		ROW = "находится в столбце под номером %d";
		ROWS = "находится в столбцах под номерами: ";
		MAX = "Максимальное значение: %d ";
		
		
		
		arr = new int [4][10];
		
		//заполняем случайными числами от 0 до 9:
		Generator.fill(arr, 0, 9);
		
		//выводим на экран массив, используя "%2d ":
		Out.printWithSpaces(arr, 2);
		
		// массив с суммами рядов:
		sumOfRow = sumOfRows(arr);
		
		// максимальное значение суммы:
		max = findMax(sumOfRow);
		
		System.out.println(MESSAGE);
		
		//выводим на экран массив сумм, используя "%2d ":
		Out.printWithSpaces(sumOfRow, 2);
		
		System.out.printf(MAX, max);
		
		// массив с номерами рядов максимальных сумм (если их несколько):
		maxIndex = findIndexOfValue(max, sumOfRow);
	
		// вывд информации об столбцах:
		if (maxIndex.length == 1){
			System.out.printf(ROW, maxIndex[0]);	
		}
		if (maxIndex.length > 1){
			System.out.printf(ROWS);
			Out.print(maxIndex);
		}
	}
		
	
	
	// создаем массив для сохранения сумм элементов в каждом столбце:
	private static int[] sumOfRows(int arr[][]) {
		int sum [] = new int [arr[0].length]; 
		for(int j = 0; j < sum.length; j++){
			for (int i = 0; i < arr.length; i++){
				sum[j] += arr[i][j];
			}
		}
		
		return sum;
	}
	
	// возвращает максимальное значение из массива:
	private static int findMax(int arr[]) {
		int max;
		max = 0;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		return max;
	}
	
	// массив с номерами рядов максимальных сумм (если их несколько):
	private static int[] findIndexOfValue(int value, int [] arr) {
		int out [];
		out = new int [0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				out = increaseArr(out);
				out[out.length-1] = i+1;
			}
		}
		return out;
	}



	// возвращает увеличенный массив
	private static int[] increaseArr(int[] array) {
		int [] out;
		out = new int [array.length+1];
		for (int i = 0; i < array.length; i++) {
			out[i] = array[i];
		}
		return out;
	}
}
