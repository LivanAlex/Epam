package by.jonline.two.array;

import by.jonline.two.array.helper.Out;

/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * |1  2   3  ... n|
 * |n n−1 n−2 ... 1|
 * |1  2   3  ... n|
 * |n n−1 n−2 ... 1|
 * |.  .   .  .   .|
 * |.  .   .    . .|
 * |n n−1 n−2 ... 1|
 */

public class MultiArray04 {

	public static void main(String[] args) {

		int n = 8; // здесь четное число
		int [][] arr = new int [n][n];
		
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				if (i == 0 || i %2 == 0){
					arr[i][j] = j+1;
				} else {
					arr[i][j] = n-j;
				}
			}
		}
		
		Out.printWithSpaces(arr);
	}

}
