package by.jonline.two.array;

import java.util.Scanner;

/**
 * 15. Найти все натуральные n-значные числа,
 * цифры в которых образуют строго возрастающую последовательность
 * (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

public class Decomposition15 {


	public static void main(String[] args) {
		int n;
		
		
		System.out.println("Введите число:");
		n = intFromUser();

		findUpNum(n);	
	}
	
	
	private static void findUpNum(int n) {
		final int ELEVEN;
		final String ERROR;
		ELEVEN = 11111111;
		ERROR = "Не существует чисел содержащих %d знаков, цифры в которых "
				+ "образуют строго возрастающую последовательность";
		if (n < 10) {
			int start;
			int end;
			
			start = (int) Math.pow(10, n-1);
			end = (int) Math.pow(10, n);
			
			for (int i = start, p = 1; i < end; i += p) {
				if (neiborsCheck(i)) {
					System.out.println(i);
					p = ELEVEN % (int) Math.pow(10, n);
				}
			}
			
		} else {
			System.out.format(ERROR, n);
		}	
	}
	
	
	private static boolean neiborsCheck(int i) {
		
		boolean isUpNum;
		int temp;
		
		isUpNum = true;
		temp = i%10+1;
		
		while (i != 0) {
			if (temp - i%10 != 1) {
				isUpNum = false;
				break;
			}
			temp = i%10;
			i /= 10;		
		}
		return isUpNum;
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
