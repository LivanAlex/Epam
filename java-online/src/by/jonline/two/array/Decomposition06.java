package by.jonline.two.array;

import java.util.Scanner;

/*
 * 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class Decomposition06 {
	

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		final String MESSAGE;
		final String COPRIME;
		final String NOT_COPRIME;
		
		MESSAGE = "Введите три числа:";
		COPRIME = "Введенные числа взаимно простые";
		NOT_COPRIME = "Введенные числа не взаимно простые";

		System.out.println(MESSAGE);
		a = intFromUser();
		b = intFromUser();
		c = intFromUser();

		if (checkCoprime(a, b, c)){
			System.out.println(COPRIME);
		} else {
			System.out.println(NOT_COPRIME);
		}
	}

	
	private static boolean checkCoprime(int a, int b){
		if (a * b == findNoc(a, b)) {
			return true;
		} else {
			return false;
		}	
	}
	
	
	private static boolean checkCoprime(int a, int b, int c){
		if (checkCoprime(a, b) && checkCoprime(a, c) && checkCoprime(c, b)) {
			return true;
		} else {
			return false;
		}	
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
	
	
	private static int findNoc(int a, int b){
		int noc;
		noc = (a*b)/findNod(a,b);
		return noc;
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
