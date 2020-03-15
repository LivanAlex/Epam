package by.jonline.two.array;

import java.util.Arrays;

/*
 * Магическим квадратом порядка n называется квадратная матрица размера nxn,
 * составленная из чисел 1, 2, 3, ..., n2 так, что суммы по каждому столбцу,
 * каждой строке и каждой из двух больших диагоналей равны между собой.
 * Построить такой квадрат. Пример магического квадрата порядка 3:
 * 
 * 6 1 8
 * 7 5 3
 * 2 9 4
 * 
 * 1+((i+j-1+(n-1)/2)%n)*n+((i+2j+2)%n)
 */

public class Sixteen {
	
	public static void main(String[] args) {
	
		int n;
		int[] source;
		int[] temp;
		
		n = 3;
		source = new int[n*n];
		temp = new int[n*n];
		temp = source;
		for (int i = 0; i < source.length; i++) {
			source[i] = i+1;
		}
		
		
		for(int i = 0; i < source.length; i++) {
			for (int j = 0; j < source.length; j++) {	
				temp = arrayWithoutIndex(source, j);
				allCombinations(temp, source, i, j);
			}
		}	
	}

	
	
	private static int[] arrayWithoutIndex(int[] source, int delete) {
		int[] out;
		out = new int[source.length-1];
		for (int i = 0, j = 0; i < out.length; i++) {
			if (j == delete) {
				j++;
			} 
			out[i] = source[j];
			j++;
		}
		return out;
	}

	
	
	private static void allCombinations(int[] temp, int[] source, int indexI, int indexJ) {
		int [] array;
		array = new int [source.length];
		for (int i = 0, j = 0; i < array.length; i++) {
			if (i != indexI) {
				array[i] = temp[j];
				j++;
			} else {
				array[i] = source[indexJ];
			}
		}
		createMatrix(array);
	}

	
	
	private static void createMatrix(int[] array) {
		int[][] magic;
		int lenghth;
		lenghth = (int) Math.sqrt(array.length);
		magic = new int [lenghth][lenghth];
		
		fill(magic, array);
		
		
		boolean x = magicCheck(magic);
		
		if (x) {
			out(magic, 2);
		}
		
	}

	
	
	private static boolean magicCheck(int[][] magic) {

		int sum;
		int check;
		int n = magic.length;
		sum = n * (n*n +1) / 2;
		check = 0;
		
		
		for (int i = 0; i < magic.length; i++) {
			check = sumOfRow(magic[i]);
			out(magic, 2);
			System.out.println(check);
			if (sum != check) {
				return false;
			}
		}
		
		for (int i = 0; i < magic.length; i++) {
			check = sumOfColumns(magic, i);
			if (sum != check) {
				return false;
			}
		}
		return true;
	}



	private static int sumOfColumns(int[][] magic, int column) {
		int sum;
		sum = 0;
		for (int i = 0; i < magic.length; i++) {
			sum += magic[i][column];
		}
		return sum;
	}






	private static int sumOfRow(int[] magic) {
		int sum;
		sum = 0;
		for (int i : magic) {
			sum += i;
		}
		return sum;
	}



	private static void out(int[][] magic, int resolution) {
		String res;
		res = "%" + resolution + "d";
		for (int i = 0; i < magic.length; i++) {
			for (int j = 0; j < magic.length; j++) {
				System.out.printf(res, magic[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
	}

	
	private static void fill(int[][] magic, int[] array) {
		for (int i = 0, k = 0; i < magic.length; i++) {
			for (int j = 0; j < magic[0].length; j++) {
				magic[i][j] = array[k];
				k++;
			}
		}
	}
}





/**
 
 я реализовал так как говорили на вебинаре,
 берем линейный массив всех чисел квадрата от 1 до n^2,
 через n выражаем все номера элементов в матрице n x n,
 и записываем соответствующие правила проверки рядов,
 столбцов и диагоналей на сумму.
 Потом свапаем любые 2 элемента в линейном массиве
 до тех пор пока не появится магический квадрат,
 n=3 и 4 ищет быстро, 5 долго, 6 не пробовал.





import by.epamtc.algorithmization.array.Array;

public class Temp {
	private static int n = 4;
	private static int magicNumber = (n*(n*n+1))/2;
	private static int[] arr = new int[n*n];
	private static int[][] magic = new int [n][n];
	
	public static void main(String[] args) {
		fillArr(arr);
		
		prmt(arr, 0);
		}

	private static void prmt(int[] arr, int i) {
		if (i == arr.length - 1) {
	    //arraout(arr);
	    check(arr);
	    } else {
	    	for (int j = i; j < arr.length; j++) {
	    		aswap(arr, i, j);
	    		prmt(arr, i + 1);
	   			aswap(arr, i, j);
		   	}
	    }
	}
	
	private static void aswap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void arraout(int[] arr) {
		String s = "[";
		for (int a : arr) {
			s += a + ", ";
		}
		s = s.substring(0, s.length() - 2);
		s += "]";
		System.out.println(s);
		}
		
	private static void check (int[] arr) {	
		for (int i = 0, k = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++, k++) {
				magic[i][j] = arr[k];
				sum +=  magic[i][j] ;
			}
		
			if (sum != magicNumber) {
				
				return;
			}
		}
		

		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += magic[j][i];
			}
			if (sum != magicNumber) {
				return;
			}
		}

		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0, j = n-1; i < n; i++, j--) {
			sum1 += magic[i][i];
			sum2 += magic[i][j];
		}
	
		if (sum1 != magicNumber || sum2 != magicNumber) {
			return;
		}
		Array.printArr(magic);
		System.out.println("");
		
	}
	private static void fillArr (int[] arr) {	
		for (int i = 0; i < n*n; i++) {
			arr[i] = i+1;
		}
	}
}

 */
