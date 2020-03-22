package by.jonline.two.array;

import by.jonline.two.array.helper.Generator;
import by.jonline.two.array.helper.Out;

/*
 * Дана матрица. Вывести на экран все нечетные столбцы,
 * у которых первый элемент больше последнего.
 */

public class MultiArray01 {
	
	public static void main(String[] args) {
		
		int [][] twoDimArr;
		final String MESSAGE;
		boolean isEven;
		
		MESSAGE = "в таблице: ";
		twoDimArr = new int [4][20];       // размер массива [4][20]
		Generator.fill(twoDimArr, -9, 10); // заполняем случайными значениями от -9 до 10
		isEven = false;                    // нечетные столбцы (можно поменять)
		
		System.out.println(MESSAGE);
		Out.printWithSpaces(twoDimArr);
		
		outMain(twoDimArr, isEven);

	}

	
	private static void outMain(int [][] twoDimArr, boolean isEven) {	
		
		final String EXIST;
		final String ABSENT;
		final String EVEN;
		final String ODD;
		
		EVEN = "\nчетные ";
		ODD = "\nнечетные ";
		EXIST = "столбцы, у которых первый элемент больше последнего:\n";
		ABSENT = "нет столбцов для вывода";
		
		if (fastCheck(twoDimArr, isEven)){                // есть ли искомые столбцы?
			
			int maxLength;                                // находим самое длинное число 
			maxLength = Out.findMaxLength(twoDimArr);     // по нему задаём форматирование
			String resolution = "%" + maxLength + "d ";	  // вывода матрицы
			
			
			if (isEven) {
				System.out.println(EVEN+EXIST);
			} else {
				System.out.println(ODD+EXIST);
			}
			

			for (int i = 0; i < twoDimArr.length; i++){   // ищем, проверяем, выводим!
				for (int j = 0; j < twoDimArr[i].length; j++){
					if (isEven(j, isEven) && firstMoreThenLast(twoDimArr, j)){
						System.out.printf(resolution, twoDimArr[i][j]);
					}
				}
				System.out.println("");
			}
		} else {
			System.out.println(ABSENT);
			}
	}
	
	private static boolean isEven(int j, boolean isEven) {
		if ((j % 2 != 0) == isEven) {
			return true;
		} else {
			return false;
		}
	}


	private static boolean fastCheck(int [][] twoDimArr, boolean isEven){  // есть ли искомые столбцы?
		for (int i = 0; i < twoDimArr[0].length; i++){
			if (isEven(i, isEven)) {
				continue;
			}
			if (firstMoreThenLast(twoDimArr, i)){
				return true; // нашли первый! выходим!
			}
		}
		return false;        // таких нет!
	}
	
	private static boolean firstMoreThenLast(int [][] twoDimArr, int column) { // подаем номер столбца, проверяем условие
		if ((twoDimArr[0][column] > twoDimArr[twoDimArr.length-1][column])){
			return true;
		} else {
			return false;
		}
	}
}
