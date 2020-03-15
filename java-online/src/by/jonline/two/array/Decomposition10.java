package by.jonline.two.array;

import java.util.Scanner;


/*
 * 10. Дано натуральное число N. Написать метод(методы)
 * для формирования массива, элементами которого являются цифры числа N.
 */


public class Decomposition10 {

	public static void main(String[] args) {
		
		int n;
		int [] arr;
		final String MESSAGE;
		MESSAGE = "введите натуральное число:";
		
		System.out.println(MESSAGE);
		
		n = intFromUser();
		arr = arrayFromNum(n);
		
		Out.print(arr);
	}
	
	
	private static int lengthInt (int num) {
		
		int count;
		
		if (num == 0) {
			return 1;
		}
		
		count = 0;
		num = Math.abs(num);
		
		while (num > 0) {
			num /=10;
			count++;
		}
		
		return count;
	}
	
	
	private static int [] arrayFromNum (int num) {
		
		int length;
		int [] arr;
		
		length = lengthInt(num);
		arr = new int [length];
		
		fillArrByNum(arr, num);
		return arr;
	}
	
	
	
	private static void fillArrByNum (int [] array, int num) {
		for (int i = array.length-1; i >= 0; i--) {
			array[i] = Math.abs(num % 10);
			num /= 10;
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
		
		if (out > 0) {
			return out;
		} else {
			errorMessage();
			return intFromUser();
		}
	}
}
