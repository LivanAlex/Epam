package by.jonline.two.array;

/* 
 * Дана последовательность действительных чисел а1 ,а2 ,..., аn.
 * Заменить все ее члены, большие данного Z, этим числом.
 * Подсчитать количество замен.
 */

public abstract class Arrays02 {
	
	
	public static void main(String[] args) {
		
		double [] arr;
		double z;
		final String MESSAGE;
		

		// массив double[9] c случайными значениями от -10 до 30
		arr = Generator.randomDoubleArray(9, -10, 30);
		z = 15.45;
		MESSAGE = "В последовательности было произведено %d замен, превышающих значение %.2f%n";
		
		
		// вывод массива на экран через пробел с двумя сотыми долями 
		Out.printWithSpaces(arr, 2);
		
		
		int counter;
		counter = replaceLargerValueByZ(arr, z);
		
		
		System.out.printf(MESSAGE, counter, z);
		
		
		Out.printWithSpaces(arr, 2);
	}
	
	
	
	private static int replaceLargerValueByZ (double [] array, double z) {
		
		int c = 0;
		
		for (int i = 0; i < array.length; i++){
			if (array[i] > z){
				c++;
				array[i] = z;
			}
		}
		
		return c;
	}
}

