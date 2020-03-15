package by.jonline.two.array;

/*
 *  Сформировать случайную матрицу m x n,
 *  состоящую из нулей и единиц,
 *  причем в каждом столбце число единиц равно номеру столбца.
 */

public class MultiArray14 {
	
	public static void main(String[] args) {
		int [][] arr;
		int m;
		int n;
		
		m = Generator.randomInt(5, 15);
		n = Generator.randomInt(5, m);
		arr = new int[m][n];
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				if (i <= j){
					arr[i][j] = 1;
				} else {
					arr[i][j] = 0;
				}
			}
		}
		
		Out.printWithSpaces(arr);
	}
}
