package by.jonline.two.array;

/*
 * Дана квадратная матрица.
 * Вывести на экран элементы, стоящие на диагонали.
 */

public class MultiArray02 {
	
	public static void main(String[] args) {
		
		int [][] twoDimArr;
		final String MESSAGE;
		final String MESSAGE2;
		
		MESSAGE = "в таблице:\n";
		MESSAGE2 = "\nдве диагонали:\n";
		twoDimArr = new int [10][10];       // размер массива [10][10]
		Generator.fill(twoDimArr, 0, 9);    // заполняем случайными значениями от 0 до 9
		
		System.out.println(MESSAGE);
		Out.printWithSpaces(twoDimArr);
		System.out.println(MESSAGE2);

		outMainDiagonal(twoDimArr);
		outSecondaryDiagonal(twoDimArr);

	}
	
	
	private static void outMainDiagonal(int [][] twoDimArr) {	

		for (int r = 0, c = 0; r < twoDimArr.length; r++, c++){
			System.out.print(twoDimArr[r][c]+ " ");
		}
		System.out.println("");
	
	}
	
	private static void outSecondaryDiagonal(int [][] twoDimArr) {	

		for (int r = twoDimArr.length-1, c = 0; c < twoDimArr.length; r--, c++){
			System.out.print(twoDimArr[r][c]+ " ");
		}
		System.out.println("");
	}
}
