package by.jonline.two.array;

/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * | 1   1   1  ...  1  1  1 |
 * | 2   2   2  ...  2  2  0 |
 * | 3   3   3  ...  3  0  0 | 
 * | .   .   .  .    .  .  . |
 * | .   .   .    .  .  .  . |
 * |n-1 n−1  0  ...  0  0  0 |
 * | n   0   0  ...  0  0  0 |
 */

public class MultiArray05 {

	public static void main(String[] args) {

		int n = 8; // здесь четное число
		int [][] arr = new int [n][n];
		
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				if (j >= n-i){
					arr[i][j] = 0;
				} else {
					arr[i][j] = i+1;
				}
			}
		}
		
		Out.printWithSpaces(arr);

	}
}
