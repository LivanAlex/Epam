package by.jonline.two.array;

import java.util.Scanner;

/*
 * 16. Написать программу, определяющую сумму n - значных чисел,
 * содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме.
 * Для решения задачи использовать декомпозицию.
 */

public class Decomposition16 {

	public static void main(String[] args) {
		
		int n;
		int sum;
		int evenCount;
		final String MESSAGE;
		final String SUM;
		final String NO_EVEN;
		final String EVEN;
		
		MESSAGE = "Введите натуральное число:";
		SUM = "сумма всех %d-значных нечетных чисел равна: %d%n%n";
		NO_EVEN = "в этом числе нет четных цифр";
		EVEN = "в числе %d есть четные цифры\nих колличество = %d";
		
		System.out.println(MESSAGE);
		n = intFromUser();
		sum = sumOfOddNum(n);
		
		System.out.format(SUM, n, sum);
		
		evenCount = findEvenCountInNum(sum);
		

		if (evenCount != 0) {
			System.out.printf(EVEN, sum, evenCount);
		} else {
			System.out.print(NO_EVEN);
		}
		

	}
	

	
	private static int sumOfOddNum(int n) {
		int sum;
		sum = 0;
		for (int i = (int) Math.pow(10, n-1); i < Math.pow(10, n); i++) {
			if (haveNotEven(i)) {
				sum += i;
			}
		}
		return sum;
	}
	
	private static int findEvenCountInNum(int num) {
		int counter;
		counter = 0;
		while (num != 0) {
			if (isEven(num % 10)) {
				counter++;
			} 
			num /= 10;
		}
		return counter;
	}

	private static boolean haveNotEven(int num) {
		boolean oddOnly;
		oddOnly = true;
		if (num == 0) {
			oddOnly = false;
		} else {
			while (num != 0) {
				if (isEven(num % 10)) {
					oddOnly = false;
					break;
				} 
				num /= 10;
			}
		}
		return oddOnly;

	}

	private static boolean isEven(int num) {
		return num % 2 == 0 ? true : false;
	}
	
	private static void errorMessage() {
		final String ERROR;
		ERROR = "Вы допустили ошибку при вводе данных, попробуйте еще раз:";
		System.out.println(ERROR);	
	}
	
	
	
	private static int intFromUser(){
		Scanner s = new Scanner(System.in);
		int out;
		while (!s.hasNextInt()) {
			s.next();
			errorMessage();
		}
		
		out = s.nextInt();
		
		if (out > 0) {
			return out;
		} else {
			errorMessage();
			return intFromUser();
		}
	}
}
