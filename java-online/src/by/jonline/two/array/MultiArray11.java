package by.jonline.two.array;

import by.jonline.two.array.helper.Generator;
import by.jonline.two.array.helper.Out;

/*
 * Матрицу 10x20 заполнить случайными числами от 0 до 15.
 * Вывести на экран саму матрицу и номера строк,
 * в которых число 5 встречается три и более раз.
 */

public class MultiArray11 {
	
	public static void main(String[] args) {
		
		int[][] arr;
		boolean isExist;
		final String MESSAGE;
		final String POSITIVE;
		final String NEGATIVE;
		
		isExist = false;
		arr = new int [10][20];	
		Generator.fill(arr, 0, 15);
		MESSAGE = "В таблице: ";
		POSITIVE = "число 5 встречается три и более раз в строках:";
		NEGATIVE = "нет строки содержащей число 5 более трех раз";
		
		System.out.println(MESSAGE);
		Out.printWithSpaces(arr);
		
		
		isExist = checkArr(arr);
		
		if (isExist){
			System.out.println(POSITIVE);
			for (int i = 0; i < arr.length; i++){
				if(checkRow(arr[i])){
					System.out.printf("%d ", i+1);
				}
			}
		} else {
			System.out.println(NEGATIVE);
		}
	}
	
	
	// возвращает true если в матрице есть
	// хотябы 1 ряд содержащий более 3х пятерок
	private static boolean checkArr(int [][] array) {
		for (int i = 0; i < array.length; i++){
			if (checkRow(array[i])) {
				return true;
			}
		}
		return false;
	}
	
	// возвращает true если в ряду есть более 3х пятерок
	private static boolean checkRow(int [] array) {	
		int counter = 0;
		for (int i = 0; i < array.length; i++){
			if (array[i] == 5){
				counter++;
				if (counter == 3){
					return true;
				}
			}
		}
		return false;
	}
	
	
}