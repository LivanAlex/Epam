package by.jonline.two.array;

/*
 * Даны целые числа а1 ,а2 ,..., аn .
 * Вывести на печать только те числа, для которых аi > i.
 */

public class Arrays05 {
	

	public static void main (String[] args) {
		
		int [] arr;
		final String MESSAGE;
		final String GOOD;
		final String BAD;
		
		MESSAGE = "В массиве из целых чисел:";
		GOOD = "больше своего порядкового номера числа:";
		BAD = "нет чисел больше своего порядкового номера";
		arr = Generator.randomIntArray(10, -9, 9);
		
		System.out.println(MESSAGE);
		Out.print(arr);
		

		int [] temp;
		temp = calculate(arr);
		
		
		if (temp.length > 0) {
			System.out.println(GOOD);
			Out.print(temp);
		} else {
			System.out.println(BAD);
		}
	}
	
	
	
	private static int[] calculate (int [] array) {
		
		int result [];
		int counter;
		
		counter = 0;
		
		// находим колличество чисел удовлетворяющих условие
		for(int i = 0; i < array.length; i++){
			if (array[i] > i){
				counter++;
			}
		}
		
		
		if (counter > 0) {
			// если числа есть создаем массив и заполняем его
			result = new int [counter];
			for(int i = 0, j = 0; i < array.length; i++){
				if (array[i] > i){
					result[j] = array[i];
					j++;
				}
			}		
		} else {
			// если чисел нет создаем пустой массив
			result = new int [0];
		}
		
		
		return result;
	}
	

}
