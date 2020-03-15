package by.jonline.two.array;

import java.util.Scanner;

/*
 * 13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
 * Для решения задачи использовать декомпозицию.
 *
 */

public class Decomposition13{

	public static void main(String[] args) {
		
		int start;
		int end;
		int [][] brothers;
		final String MESSAGE;
		
		MESSAGE = "введите число более двух:";
		System.out.println(MESSAGE);
		start = intFromUser();
		end = start * 2;
		
		brothers = findBrothers(start, end);
		printBrothers(brothers, start, end);
	}

	
	private static int [][] findBrothers(int start, int end) {
		int length;
		int [][] brothers;
		
		length = end - start - 1;
		brothers = new int [2][length];
		
		for (int i = 0; i < brothers[0].length; i++) {
			brothers [0][i] = start;
			brothers [1][i] = start + 2;
			start++;
		}
		return brothers;
	}
	
	
	private static void printBrothers(int [][] brothers, int start, int end) {
		final String OUT;
		OUT = "близнецы из отрезка [%d,%d]:\n";
		
		System.out.format(OUT, start, end);
		
		int formater;
		formater = 0;
		for (int i = 0; i < brothers[0].length; i++) {
		System.out.printf("%d и %d; ", brothers[0][i], brothers[1][i]);
		formater++;
		if (formater == 6) {
			System.out.println("");
			formater = 0;
		}
		}
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
		
		if (out > 2) {
			return out;
		} else {
			errorMessage();
			return intFromUser();
		}
	}
}
