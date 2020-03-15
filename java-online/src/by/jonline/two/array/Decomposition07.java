package by.jonline.two.array;

/*
 * 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */

public class Decomposition07 {

	public static void main(String[] args) {
		
		int result;
		
		result = sumFact(1,9);     //  диапазон [1;9]
		
		System.out.println(result);
		
	}

	
	private static int sumFact (int from, int to) {
		
		int sumFact;
		sumFact = 0;
		
		for (int i = from; i < to +1; i++) {
			
			if (!even(i)) {          //  !even(i) - нечетные, even(i) - четные
				sumFact += fact(i);
			}
		}
		
		return sumFact;
	}
	
	
	private static boolean even (int num) {
		return num%2 == 0 ? true : false;
	}
	
	
	private static int fact (int num) {  // факториал
		
		int fact;
		fact = 1;
		
		for (int i = num; i > 0; i--) {
			fact *= i;
		}
		
		return fact;
	}
}
