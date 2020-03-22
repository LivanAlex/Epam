package by.jonline.two.array;

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
 * 
 */


public class MultiArray16 {
	
	public static void main(String[] args) {
	
		int n;
		int[] source;
		int magicSum;
		
		n = 3;
		source = new int[n*n];
		magicSum = n * (n*n +1) / 2;
		
		for (int i = 0; i < source.length; i++) {
			source[i] = i+1;
		}
		
		checkNprint(source, n, magicSum);
		run(source, n, magicSum);
	}
	
	
	private static void run(int[] array, int n, int magicSum) {
		
		int indexOne=0;
		int indexTwo=0;

		while(indexOne != -1) {
			
			indexOne = findIndexOne(array);
			if (indexOne > -1) {
				
				indexTwo = findIndexTwo(array, indexOne);
				swap(array, indexOne, indexTwo);
				sort(array, indexOne);
				
				checkNprint(array, n, magicSum);
			}
		}
		
	}

	
	private static void sort(int[] array, int indexOne) {
		for(int i = indexOne+1; i < array.length-1; i++) {
			for (int j = array.length-1; j > i; j--) {
				if(array[j] < array[i]) {
					swap(array, j, i);
				}
			}
		}	
	}

	
	private static int findIndexTwo(int[] array, int indexOne) {
		int min = 2147483647;
		for (int j = array.length - 1; j > indexOne; j--) {
			if(array[j] > array[indexOne] && array[j] < min) {
				min = array[j];
				return j;
			}
		}
		return -1;
	}

	
	private static int findIndexOne(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			if(array[i] > array[i-1]) {
				return i-1;
			}
		}
		return -1;
	}

	
	private static void swap(int[] array, int indexOne, int indexTwo) {
		int temp = array[indexOne];
		array[indexOne] = array[indexTwo];
		array[indexTwo] = temp;
	}	
	
	
	private static void checkNprint(int[] array, int n, int magicSum) {
		if(isMagic(array, n, magicSum)) {
			for (int i = 0; i < array.length; i++) {
				if(i != 0 && i%n == 0) {
					System.out.println();
				}
				System.out.printf("%2d ", array[i]);
			}
			System.out.println();
			System.out.println();
		}
	}

	
	private static boolean isMagic(int[] array, int n, int magicSum) {
		
		int sum;
		for (int i = n; i <= n*n; i+=n) {
			sum = 0;
			for (int j = i-1; j >= i-n; j--) {
				sum += array[j];
			}
			if (sum != magicSum) {
				return false;
			}
		}
		
		for (int i = 0; i < n; i++) {
			sum = 0;
			for (int j = i; j < n*n; j+=n) {
				sum += array[j];
			}
			if (sum != magicSum) {
				return false;
			}
		}
		sum = 0;
		for (int i = 0; i < n*n; i += (n+1)) {
			sum += array[i];
			
		}
		
		if (sum != magicSum) {
			return false;
		}
		sum = 0;
		
		for (int i = n-1; i < n*n-1; i += (n-1)) {
			sum += array[i];
			
		}
		if (sum != magicSum) {
			return false;
		}
		
		return true;
	}
}