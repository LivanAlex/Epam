package by.jonline.two.array;

/*
 *  Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

import java.util.Scanner;

public class Decomposition02 {

	public static void main(String[] args) {

		final String MESSAGE;
		final String NOD;
		int a;
		int b;
		int c;
		int d;
		MESSAGE = "Введите 4 числа:";
		NOD = "Наибольшим общим делителем для этих чисел является:";
		
		System.out.println(MESSAGE);
		a = intFromUser();
		b = intFromUser();
		c = intFromUser();
		d = intFromUser();
		
		int out = findNod(a, b, c, d);
		
		System.out.println(NOD);
		System.out.println(out);

	}
	
	private static int findNod(int a,int b, int c,int d){
		int x = findNod(a, b);
		int y = findNod(c, d);
		return findNod(x, y);
	}
	
	private static int findNod(int a, int b){
		
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		while (a % b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}

		return b;		
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
		out = Math.abs(out);
		
		if (out != 0) {
			return out;
		} else {
			errorMessage();
			return intFromUser();
		}

	}
}
