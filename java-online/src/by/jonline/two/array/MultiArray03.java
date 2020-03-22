package by.jonline.two.array;

import by.jonline.two.array.helper.Generator;
import by.jonline.two.array.helper.Out;

/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class MultiArray03 {
	
	
	public static void main(String[] args) {
		
		int[][] twoDimArr;
		int k;
		int p;
		final String MESSAGE;
		
		twoDimArr = Generator.twoDimArrayInt(2, 9);
		
		k = Generator.randomInt(1, (twoDimArr.length));       // сюда вводим номер строки  (начиная с 1)
		p = Generator.randomInt(1, (twoDimArr[0].length));    // сюда вводим номер столбца (начиная с 1)
		
		k--;
		p--;

		Generator.fill(twoDimArr, 0, 9);
		MESSAGE = "в таблице:\n";

		System.out.println(MESSAGE);
		Out.printWithSpaces(twoDimArr);
		

		outColumn(twoDimArr, p);
		outRow(twoDimArr, k);
		
	}
	
	private static void outColumn(int [][] twoDimArr, int p) {
		
		boolean isExist;
		final String ROW;
		final String ROW_ERROR;
		
		
		isExist = checkRow(twoDimArr, p);
		ROW = "\nстолбец под номером %d:\n";
		ROW_ERROR = "\nнет столбца под номером %d:\n";
		
		if (isExist) {
			System.out.printf(ROW, p+1);
			
			for (int i = 0; i < twoDimArr.length; i++){
				System.out.printf("%d%n", twoDimArr[i][p]);
			}
		} else {
			System.out.printf(ROW_ERROR, p+1);
		}

		
	}
	
	private static void outRow(int [][] twoDimArr, int k) {	

		boolean isExist;
		final String COLUMN;
		final String COLUMN_ERROR;
		
		isExist = checkColumn(twoDimArr, k);
		COLUMN = "\nстрока под номером %d:\n";
		COLUMN_ERROR = "\nнет строки под номером %d:\n";
		
		if (isExist) {
			System.out.printf(COLUMN, k+1);
			
			for (int i = 0; i < twoDimArr[0].length; i++){
				System.out.printf("%d", twoDimArr[k][i]);
			}
		} else {
			System.out.printf(COLUMN_ERROR, k+1);
		}
		
	}
	
	
	
	private static boolean checkRow(int[][] twoDimArr, int p) {	
		
		if (p >= twoDimArr[0].length || p < 0) {
			return false;
		}
		return true;
	}
	
	
	
	private static boolean checkColumn(int[][] twoDimArr, int k) {	
		
		if (k >= twoDimArr.length || k < 0) {
			return false;
		}
		return true;
	}

	
}
