package by.jonline.two.array;

import java.util.Scanner;

/*
 *  Написать метод(методы) для нахождения наибольшего общего делителя
 *  и наименьшего общего кратного двух натуральных чисел:
 *  
 *  НОК(A,B) = A * B / (НОД(A,B))
 */

public class Decomposition01 {

	public static void main(String[] args) {
		final String MESSAGE;
		final String NOD;
		final String NOK;
		
		MESSAGE = "Введите два числа отличные от нуля:";
		NOD = "Наибольшим общим делителем для чисел %d и %d является: ";
		NOK = "Наименьшим общим кратным для чисел %d и %d является: "; 
		
		System.out.println(MESSAGE);
		
		int a = intFromUser();
		int b = intFromUser();
		
		System.out.printf(NOD, a ,b);
		System.out.println(findNod(a, b));
		System.out.printf(NOK, a ,b);
		System.out.println(findNoc(a, b));
		

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
	
	
	
	private static void errorMessage() {
		final String ERROR;
		ERROR = "Вы допустили ошибку при вводе данных, попробуйте еще раз:";
		System.out.println(ERROR);
		
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
	
	private static int findNoc(int a,int b){

		int noc = (a*b)/findNod(a,b);
		return noc;
	}

}
