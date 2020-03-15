package by.jonline.two.array;

/*
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */


public class MultiArray15 {

	public static void main(String[] args) {
		int [][] arr;
		int max;
		final String MESSAGE;
		
		arr = new int [9][5];
		MESSAGE = "\nВсе нечетные эллементы замены на %d:\n\n";
		
		Generator.fill(arr, -9, 10);
		Out.printWithSpaces(arr);
		
		max = maxOfArr(arr);
		
		replaysOdd(arr, max);
		
		System.out.printf(MESSAGE, max);
		Out.printWithSpaces(arr);

	}
	
	private static int maxOfArr(int array[][]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++){
				if (array[i][j] > max){
					max = array[i][j];
				}
			}
		}
		return max;
	}
	
	private static void replaysOdd(int array[][], int max) {
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++){
				if (isOdd(array[i][j])){
					array[i][j] = max;
				}
			}
		}
	}
	
	private static boolean isOdd(int value) {
		return value %2 != 0;

	}

}
