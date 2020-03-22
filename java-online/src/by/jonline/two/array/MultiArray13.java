package by.jonline.two.array;

import by.jonline.two.array.helper.Generator;
import by.jonline.two.array.helper.Out;

/*
 * Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */

public class MultiArray13 {

	public static void main(String[] args) {
		
		int arr [][]; 
		final String SORTUP;
		final String SORTDOWN;
		
		SORTDOWN = "\nсортируем столбцы по убыванию:\n";
		SORTUP = "\nсортируем столбцы по возрастанию:\n";
		arr = new int [5][8];
		
		Generator.fill(arr, 0, 9);  // заполняем массив случайными числами от 0 до 9
		Out.printWithSpaces(arr);   // выводим на экран
		
		System.out.println(SORTDOWN);
		sortColumnDown(arr);		    // сортируем столбцы по убыванию
		Out.printWithSpaces(arr);   // выводим на экран
		
		System.out.println(SORTUP);
		sortColumnUp(arr);			// сортируем столбцы по возрастанию

		Out.printWithSpaces(arr);   // выводим на экран
		
	}
	
	private static void sortColumnDown(int arr[][]) {	
		for (int i = 0; i < arr[0].length; i++){
			for (int j = arr.length; j > 0; j--){
				for (int k = 1; k < j; k++)
					if (arr[k][i] > arr[k-1][i]){
						swap(arr, k, i);
					}
			}
		}
	}
	private static void sortColumnUp(int arr[][]) {	
		for (int i = 0; i < arr[0].length; i++){
			for (int j = arr.length; j > 0; j--){
				for (int k = 1; k < j; k++)
					if (arr[k][i] < arr[k-1][i]){
						swap(arr, k, i);
					}
			}
		}
	}
	
	private static void swap(int [][] array, int k, int i) {	
		int temp;
		temp = array[k][i];
		array[k][i] = array[k-1][i];
		array[k-1][i] = temp;
	}
	

}
