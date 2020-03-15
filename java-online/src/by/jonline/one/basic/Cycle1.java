package by.jonline.one.basic;
import java.util.Scanner;

/*
 *   Напишите программу, где пользователь вводит
 *   любое целое положительное число. А программа суммирует
 *   все числа от 1 до введенного пользователем числа.
 *
 */

public class Cycle1 {
	
	public static void main(String[] args) {
    	
		int number;
        int result;
        
        number = getPositiveIntFromConsole();
        result = 0;
        
        for (int i = 1; i < number; i++) {
            result += i;
        }
        
        System.out.print("Сумма всех целых чисел от 1 до " + number +" равна: ");
        System.out.println(result);
    }
    
	
	
	private static int getPositiveIntFromConsole() {
		
		int num;
		
		System.out.println("Введите целое положительное число:");
		
		num = getIntFromConsole();
		
		while (num < 0) {
			errMessage();
			num = getIntFromConsole();
		}
		return num;
    }
    

	
    private static int getIntFromConsole() {
    	
    	Scanner sc = new Scanner(System.in);
    	int num;

    	while (!sc.hasNextInt()) {
    		sc.next();
    		errMessage();
    	}
    	
    	num = sc.nextInt();
    	return num;
    }
    
    
    
    private static void errMessage() {
    	System.out.println("Вы допустили ошибку при вводе данных, попробуйте еще раз:");
    } 
}
