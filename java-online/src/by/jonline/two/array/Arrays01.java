package by.jonline.two.array;

/*
 * В массив A [N] занесены натуральные числа.
 * Найти сумму тех элементов, которые кратны данному К.
 */

public abstract class Arrays01 {
	
	public static void main (String[] args){
		
		int k;
		int[] arr;
		int sum;
		final String MESSAGE;
	
		MESSAGE = "сумма эллементов кратных %d:%n%d";
		k = 3;
		arr = Generator.randomIntArray(9, 0, 10); // массив int[9] c случайными значениями от 0 до 10
		
		Out.print(arr);   // выводим на экран через пробел
		
		sum = sumOfMultipleOfNum(arr, k);
		
		System.out.printf(MESSAGE, k, sum);
	}
	
	
	
	
	private static int sumOfMultipleOfNum(int [] array, int num) {
		
		int result = 0;
		
		
		for (int i : array){
			if (i % num == 0){
				result += i;
			}
		}
		
		
		return result;
	}
	
}

