package by.jonline.one.basic;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

import java.util.Scanner;

public class Cycle7 {


    public static void main(String[] args) {
        int m;
        int n;
 
        System.out.println("Введите начало промежутка");
        
        m = getNum();
        
        System.out.println("Введите конец промежутка");
        
        n = getNum(m);
  

        for (int i = 0; i <= n-m; i++) {
            System.out.print(m+i+ " - ");
            boolean isSimple = true;
            for (int j = 2; j < m+i; j++){
                if ((m+i)%j == 0){
                	System.out.print(j + " ");
                	isSimple = false;
                }
            }
            if (isSimple) {
            	System.out.print("не имеет делителей");
            }
            System.out.println("");
        }

    }
    
    private static int getNum() {	
		
    	int num;
		num = getIntFromConsole();
		
		while (num < 1) {
			errMessage();
			num = getIntFromConsole();
		}
		
		return num;
    }
    
    
    
    private static int getNum(int m) {	
		
    	int num;
		num = getNum();
		
		while (num < m) {
			errMessage();
			num = getNum();
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

