package by.jonline.two.array;

/*
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class MultiArray12 {

	public static void main(String[] args) {
		int arr [][]; 
		final String SORTUP;
		final String SORTDOWN;
		
		SORTDOWN = "\nсортируем строки по убыванию:\n";
		SORTUP = "\nсортируем строки по возрастанию:\n";
		arr = new int [5][8];
		
		Generator.fill(arr, 0, 9); // заполняем массив случайными числами от 0 до 9
		Out.printWithSpaces(arr);  // выводим на экран
		
		System.out.println(SORTDOWN);
		sortRowDown(arr);		   // сортируем строки по убыванию
		Out.printWithSpaces(arr);  // выводим на экран
		
		System.out.println(SORTUP);
		sortRowUp(arr);			   // сортируем строки по возрастанию

		Out.printWithSpaces(arr);  // выводим на экран

		
	}
	
	private static void sortRowDown(int arr[][]) {	
		for (int i = 0; i < arr.length; i++){
			for (int j = arr[i].length; j > 0; j--){
				for (int k = 1; k < j; k++)
					if (arr[i][k] > arr[i][k-1]){
						swap(arr[i], k);
					}
			}
		}
	}
	
	
	private static void sortRowUp(int arr[][]) {	
		for (int i = 0; i < arr.length; i++){
			for (int j = arr[i].length; j > 0; j--){
				for (int k = 1; k < j; k++)
					if (arr[i][k] < arr[i][k-1]){
						swap(arr[i], k);
					}
			}
		}
	}
	
	private static void swap(int [] array, int k) {	
		int temp;
		temp = array[k];
		array[k] = array[k-1];
		array[k-1] = temp;
	}
}
