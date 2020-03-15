package by.jonline.two.array;

/*
 * Задана последовательность N вещественных чисел.
 * Вычислить сумму чисел, порядковые номера которых являются простыми числами.
*/

public class Arrays06 {
	

	
	public static void main(String[] args) {
		
		double [] arr;
		double sum;
		final String MESSAGE;
		
		
		MESSAGE = "сумма равна %.2f";
		arr = Generator.randomDoubleArray(10, -10, 10);
		
		Out.print(arr, 2);
		
		sum = calculateSumOfSimpleIndex(arr);
		
		System.out.printf(MESSAGE, sum);
	}
	
	
	private static boolean simpleCheck (int num) {   // возвращает true если число простое
		
		boolean isSimple = false;
		
		if (num == 2){
			isSimple = true;
		}
		for (int i = 2; i < num; i++){
			if (num % i == 0){
				isSimple = false;
				break;
			}
			if (i > Math.sqrt(num)){
				isSimple = true;
				break;
			}
		}
		return isSimple;
	}
	
	
	private static double calculateSumOfSimpleIndex (double [] a) {
		
		int sum =  0;
		for (int i = 0; i < a.length; i++){
			if (simpleCheck(i)){
				System.out.printf("index %d is %.2f%n", i, a[i]);
				sum += a[i];
			}
		}
		
		return sum;
	}
}

