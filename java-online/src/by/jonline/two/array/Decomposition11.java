package by.jonline.two.array;

import java.util.Scanner;

/*
 * 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class Decomposition11 {

	
	public static void main(String[] args) {	
		
		int a;
		int b;
		int aLength;
		int bLength;
		final String MESSAGE;
		
		MESSAGE = "Введите 2 числа:";
		
		System.out.println(MESSAGE);
		
		a = intFromUser();
		b = intFromUser();
		aLength = lengthInt(a);
		bLength = lengthInt(b);
		
		checkAndOut(a,b,aLength,bLength);
	}
	
	
	private static void checkAndOut(int a, int b, int aLength, int bLength) {
		final String OUT;
		final String EQUALS;
		
		OUT = "число %d состоит из %d цифр, что на %d больше чем в числе %d из %d цифр";
		EQUALS = "число %d и число %d  состоят из %d цифр";
		
		if (aLength> bLength) {
			System.out.format(OUT, a,aLength, aLength - bLength, b, bLength);
		} else if (aLength < bLength) {
			System.out.format(OUT, b, bLength, bLength-aLength, a, aLength);
		} else {
			System.out.format(EQUALS, a, b, aLength);
		}
	}
	
	
	private static int lengthInt (int num) {
		int count = 0;
		if (num == 0) {
			return 1;
		}
		num = Math.abs(num);
		while (num > 0) {
			num /=10;
			count++;
		}
		return count;
	}
	
	
	private static void errorMessage() {
		final String ERROR;
		ERROR = "Вы допустили ошибку при вводе данных, попробуйте еще раз:";
		System.out.println(ERROR);	
	}
	
	
	
	private static int intFromUser(){
		Scanner s = new Scanner(System.in);
		while (!s.hasNextInt()) {
			s.next();
			errorMessage();
		}
		
		return s.nextInt();
	}
}
