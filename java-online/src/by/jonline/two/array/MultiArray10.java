package by.jonline.two.array;

import by.jonline.two.array.helper.Generator;
import by.jonline.two.array.helper.Out;

/*
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class MultiArray10 {

	
	public static void main(String[] args) {
		
		int arr[][];
		int row;   	
		int column;
		final String MESSAGE;
		
		row = (int) (Math.random() * 7 + 3);   // от 2 до 9	
		column = row;
		arr = new int [row][column];
		MESSAGE = "В квадратной матрице: ";
		
		Generator.fill(arr, -9, 2);            // случайные значения от -9 до 2
	
		System.out.println(MESSAGE);
		
		Out.printWithSpaces(arr);

		
		mainOut(arr);

	}
	
	

	//массив с номерами рядов максимальных сумм (если их несколько):
	private static void mainOut(int [][] arr) {
		final String POSITIVE;
		final String NEGATIVE;
		
		POSITIVE = "Найдены следующие положительные элементы главной диагонали: ";
		NEGATIVE = "Не найдено положительных элементов на главной диагонали";
		
		if(checkDiagonal(arr)) {
			System.out.println(POSITIVE);
			for (int i = 0; i < arr.length; i++){
					if (arr[i][i] > 0){
						System.out.printf(" %d ", arr[i][i]);
					}
			}
		} else {
			System.out.println(NEGATIVE);
		}
	}

	
	
	
	private static boolean checkDiagonal(int[][] arr) {
		for (int i = 0; i < arr.length; i++){
			if (arr[i][i] > 0){
				return true;
			}
		}
		return false;
	}
}
