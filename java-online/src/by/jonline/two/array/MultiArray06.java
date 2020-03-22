package by.jonline.two.array;

import by.jonline.two.array.helper.Out;

/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * | 1   1   1  ...  1   1   1 |
 * | 0   1   1  ...  1   1   0 |
 * | 0   0   1  ...  1   0   0 |
 * | .   .   .  .    .   .   . |
 * | .   .   .    .  .   .   . |
 * | 0   0   1  ...  1   0   0 |
 * | 0   1   1  ...  1   1   0 | 
 * | 1   1   1  ...  1   1   1 |
 */

public class MultiArray06 {

	public static void main(String[] args) {

		int n = 12; // здесь четное число
		int [][] arr = new int [n][n];
		
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				if ((i >= j && j >= n-i-1)||(i <= j && j < n-i)){
					arr[i][j] = 1;
				} else {
					arr[i][j] = 0;
				}
			}
		}	
		Out.printWithSpaces(arr);
	}
}
