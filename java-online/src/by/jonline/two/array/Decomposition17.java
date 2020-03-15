package by.jonline.two.array;
import java.util.Scanner;

/*
 * 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
 * Сколько таких действий надо произвести, чтобы получился нуль?
 * Для решения задачи использовать декомпозицию.
 */

public class Decomposition17 {

	public static void main(String[] args) {

		int n;
		int result;
		final String MESSAGE;
		final String OUT;
		
		MESSAGE = "Введите натуральное число:";
		OUT = "Искомое число: %d";
		
		System.out.println(MESSAGE);
		
		n = intFromUser();
		result = superFunc(n);
		
		System.out.format(OUT, result);

	}
	

	private static int superFunc(int num) {
		int count;
		count = 0;
		while (num  > 0) {
			num -= sumOfNum(num);
			count++;
		}
		return count;
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
