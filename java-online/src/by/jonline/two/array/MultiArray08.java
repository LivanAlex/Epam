package by.jonline.two.array;

import java.util.Scanner;

/*
 *  В числовой матрице поменять местами два столбца любых столбца,
 *  т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
 *  а его элементы второго переместить в первый.
 *  Номера столбцов вводит пользователь с клавиатуры.
 */

public class MultiArray08 {

	public static void main(String[] args) {
		
		int [][] arr;
		int columnOne;
		int columnTwo;
		final String MESSAGE;
		final String FIRST;
		final String SECOND;
		
		Scanner s = new Scanner(System.in);
		
		arr = new int [4][10];	
		randomFill(arr);
		MESSAGE = "Какие номера столбцов таблицы желаете поменять месами?";
		FIRST = "Введите номер первого столбца";
		SECOND = "Введите номер второго столбца";
		
		Out.printWithSpaces(arr);
		
		

		System.out.println(MESSAGE);
		System.out.println(FIRST);
		
		columnOne = rowNumFromUser(arr);
		
		System.out.println(SECOND);
		columnTwo = rowNumFromUser(arr);
		
		changeColumns(arr, columnOne, columnTwo);
		
		Out.printWithSpaces(arr);

	}
	
	
	
	private static void randomFill(int [][] x) {	
		for (int i = 0; i < x.length; i++){
			for (int j = 0; j < x[i].length; j++){
				x[i][j] = (int) (Math.random() * 10);
			}
		}
	}

	
	
	private static void changeColumns(int [][] arr, int columnOne, int columnTwo) {
		for (int i = 0; i < arr.length; i++){
			changeNumbers(arr[i], columnOne-1, columnTwo-1);
		}
		
	}
	
	
	
	private static void changeNumbers (int a[], int b, int c){
		int temp = a[b];
		a[b] = a[c];
		a[c] = temp;
	}
	
	
	
	
	private static int rowNumFromUser(int [][] array) {
		
		final String ERROR;
		int result;
		ERROR = "вы допустили ошибку при вводе данных, пропробуйте еще раз";
		Scanner sc = new Scanner(System.in);
		

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(ERROR);
		}
		
		result = sc.nextInt();
		
		if (result >= 1 && result < array[0].length) {
			return result;
		} else {
			System.out.println(ERROR);
			return rowNumFromUser(array);
		}
	}
	

}
