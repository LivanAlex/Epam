package by.jonline.two.array;

/*
 * 12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
 * элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */

public class Decomposition12 {
	

	public static void main(String[] args) {
		
		int n;
		int k;
		int [] a;
		
		n = 200;
		k = 12;
		a = calculateArray(n,k);
		out(a, n, k);
	}
	
	
	private static void out(int [] arr, int n, int k) {
		final String OUT;
		final String NO;
		
		OUT = "числа до %d, сумма цифр которых равна %d:\n";
		NO = "не существует чисел до %d, сумма цифр которых равна %d\n";
		
		if (arr.length > 0) {
			System.out.format(OUT, n ,k);
			printArr(arr);
		} else {
			System.out.format(NO, n ,k);
		}
	
	}
	
	
	// возвращает массив элементами которого являются числа,
	// сумма цифр которых равна К и которые не большее N
	private static int [] calculateArray (int n, int k) {

		int [] array = new int [0];
		
		for(int i = 0; i < n; i++) {
			if(sumOfNumberDigits(i) == k) {
				array = addNumToArray(array, i);
			}
		}	
		
		return array;
	}
	
	
	// возвращает сумму цифр числа
	private static int sumOfNumberDigits (int num) {
		if (num == 0) {
			return 0;
		} else {
			int [] arr;
			int sum;
			
			arr = digitsArrayFromNumber(num);
			sum = sumOfArray(arr);
			return sum;
		}
	}
	
	
	// возвращает массив из цифр числа
	private static int [] digitsArrayFromNumber (int num) {
		
		int length;
		int [] array;
		
		length = lengthInt(num);
		array = new int [length];
		
		for (int i = array.length-1; i >= 0; i--) {
			array[i] = num % 10;
			num /= 10; 
		}
		
		return array;
	}

	
	// возвращает длину числа
	private static int lengthInt (int num) {
		int count = 0;
		num = Math.abs(num);
		while (num > 0) {
			num /=10;
			count++;
		}
		return count;
	}
	
	
	// возвращает сумму цифр массива
	private static int sumOfArray (int [] array) {
		int sum = 0;
		for (int i : array ) {
			sum += i;
		}
		return sum;
	}
	
	
	// увеличивает массив на 1 элемент, добавляет в массив число и возвращает полученный массив
	private static int [] addNumToArray(int[] array, int num) {
		int [] result;
		result = new int [array.length+1];
		
		for (int i = 0; i < array.length; i++) {
			result[i] = array[i];
		}
		result[array.length] = num;
		return result;
	}
	
	// выводит на экран массив
	private static void printArr(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
	}
}

