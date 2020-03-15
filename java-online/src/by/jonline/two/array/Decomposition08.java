package by.jonline.two.array;

/**
 * 8. Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы
 * трех последовательно расположенных элементов массива с номерами от k до m.
 */

public class Decomposition08 {

	public static void main(String[] args) {
		
		int [] d;
		int a;
		int b;
		int c;
		int sumA;
		int sumB;
		int sumC;
		String out;
		
		d = new int [10];
		
		Generator.fill(d, 0, 9);
		Out.print(d);
		
		a = 1;
		b = 3;
		c = 4;
		
		sumA = sumOfArr(d, a);
		sumB = sumOfArr(d, b);
		sumC = sumOfArr(d, c);
		
		out = generateOut(sumA, a);
		out += generateOut(sumB, b);
		out += generateOut(sumC, c);
		
		System.out.printf(out);

	}
	
	private static String generateOut(int sum, int k) {
		
		final String PATTERN;
		PATTERN = "D[%d] + D[%d] + D[%d] = %d;\n";
		return String.format(PATTERN, k, k+1, k+2, sum);

	}
	
	private static int sumOfArr(int[] array, int k) {
		
		boolean indexExist;
		int sum;
		
		indexExist = indexCheck(array, k);
		sum = 0;
		
		if (indexExist) {
			for (int i = k; i < k+3; i++) {
				sum += array[i];
			}
		}

		return sum;
	}

	private static boolean indexCheck(int[] array, int k) {
		
		int arrayLength;
		arrayLength = array.length;
		
		return k >= 0 && k + 2 < arrayLength - 1 ? true : false;
	
	}

}
