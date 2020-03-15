package by.jonline.two.array;

import java.util.Scanner;

/*
 * 14. Натуральное число, в записи которого n цифр, называется числом Армстронга,
 * если сумма его цифр, возведенная в степень n, равна самому числу.
 * Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */

public class Decomposition14 {
	

	public static void main(String[] args) {
		
		int k;
		final String MESSAGE;
		final String ARMSTRONG;
		final String TRUE_ARMSTRONG;
		
		MESSAGE = "Введите натуральное число:";
		ARMSTRONG = "%nчисла Армстронга от 1 до %d по условию задачи:%n";
		TRUE_ARMSTRONG = "%n%nчисла Армстронга от 1 до %d на самом деле:%n";
		
		System.out.println(MESSAGE);
		k = intFromUser();
		
		System.out.format(ARMSTRONG, k);
		outArmstrong(k);
		
		System.out.format(TRUE_ARMSTRONG, k);
		outTrueArmstrong(k);
		
	}

	private static void outArmstrong(int k) {
		for (int i = 1; i < k; i++) {
			int a;
			int b;
			
			a = sumOfNum(i);
			b = countOfNum(i);
			
			if(((int) Math.pow(a, b)) == i) {
				System.out.printf("%d, ", i);
			}
		}
	}
	
	private static void outTrueArmstrong(int k) {

		for (int i = 1; i < k; i++) {
			if(isArmstrong(i) == i) {
				System.out.printf("%d, ", i);
			}
		}
	}

	private static int isArmstrong(int num) {
		
		int sum;
		int a;
		int exponent;
		
		sum = 0;
		a = 0;
		exponent = countOfNum(num);
		
		while(num != 0){
				a = (int)(num % 10); 
		        sum += (int) Math.pow(a, exponent);
		        num/=10;
		}
		
		return sum;
	}
	
	
	private static int countOfNum(int num) {
		return num == 0 ? 0 : (int) Math.log10(num)+1;
	}
	
	
	private static int sumOfNum(int num) {
		
		int sum;
		sum = 0;
		
		while(num != 0){
		        sum += (num % 10);
		        num/=10;
		}
		
		return sum;
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
