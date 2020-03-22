package by.jonline.two.array;

import by.jonline.two.array.helper.Generator;
import by.jonline.two.array.helper.Out;

/*
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
 * Если таких чисел несколько, то определить наименьшее из них.
 */

public class Arrays09 {

	public static void main(String[] args) {
		
		int n;
		int [] arr;
		int [] repeatedUnicNumbers;
		int minValue;
		
		n = 20;  // здесь можно изменить размер массива
		arr = Generator.randomIntArray(n, 0, 15);
		
		repeatedUnicNumbers = findRepeatedUnicNumbers(arr);
		minValue = findMinValue(repeatedUnicNumbers);
		
		out(arr, repeatedUnicNumbers, minValue);		
	}


	private static int[] findRepeatedUnicNumbers(int [] array){
		
		int [] countOfRepeatsArray;
		int [] repeatedUnicNumbers;
		int maxValue;
		int countOfMaxValue;
		int countOfUnicNumbers;

		// массив с данными о количестве повторений каждой цифры:
		countOfRepeatsArray = generateCountOfRepeatsArray(array);
		
		// значение максимального количества повторений:
		maxValue = findMaxValue(countOfRepeatsArray);
		
		if (maxValue == 1) { // если 1 то все числа в единственном экземпляре!
			return array;
		}
		
		// колличество таких значений:
		countOfMaxValue = findCountOfNum(countOfRepeatsArray, maxValue);
		
		// колличество наиболее часто встречающихся чисел:
		countOfUnicNumbers = countOfMaxValue / maxValue;
		
		if (countOfUnicNumbers == 1) {
			int i = 0;
			while (countOfRepeatsArray[i] != countOfMaxValue) {
				i++;
			}
			repeatedUnicNumbers = new int[] {array[i]};
		} else {
			repeatedUnicNumbers = findUnicNumbers(array, countOfRepeatsArray, maxValue, countOfUnicNumbers);
		}

		return repeatedUnicNumbers;
		
	}
	
	
	
	
	
	private static int findCountOfNum(int [] array, int num){
		
		int count;
		count = 0;
		
		for (int i : array) {
			if (i == num) {
				count++;
			}
		}
		
		return count;
	}
	
	
	// вычисляем сколько раз повторяется каждая цифра, данные заносим в равный по размеру массив
	private static int[] generateCountOfRepeatsArray(int [] array){       
		
		int [] repetedArray;
		repetedArray = new int [array.length];
		
		
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array.length; j++){
				if(array[i]==array[j]){
					repetedArray[i]++;
				}
			}
		}
		
		return repetedArray;
	}
	
	
	
	
	private static int[] findUnicNumbers(int[]array, int[] countOfRepeatsArray, int maxValue, int countOfUnicNumbers){
		
		int [] repeatedUnicNumbers;
		repeatedUnicNumbers = new int [countOfUnicNumbers]; // инициализируем массив для повторяющихся чисел
		
		for (int i = 0; i < repeatedUnicNumbers.length; i++){		// заполняем его
			for (int j = 0; j < countOfRepeatsArray.length; j++){
				if (countOfRepeatsArray[j] == maxValue){
					repeatedUnicNumbers[i] = array[j];
						for(int k = j; k < countOfRepeatsArray.length; k++){ // избавляемся от повторов
							if (array[j] == array[k]){
								countOfRepeatsArray[k] = 0;
							}
						}
					break;
				}
			}
		}
		return repeatedUnicNumbers;
	}
	
	
	
	
	private static int findMaxValue(int [] array){
		
		int max = Integer.MIN_VALUE;
		
		for (int i : array) {
			if (i > max) {
				max = i;
			}
		}
		
		return max;	
	}
	
	
	
	private static int findMinValue(int [] array){
		
		int min = Integer.MAX_VALUE;
		
		for (int i : array) {
			if (i < min) {
				min = i;
			}
		}
		
		return min;
	}
	
	
	
	
	private static void out(int[] array, int [] repeatedUnicNumbers, int minValue){
		
		final String MESSAGE;
		final String UNIC;
		final String REPEATED;
		final String MIN;
		
		MESSAGE = "В массиве из целых чисел:";
		UNIC = "все числа представлены в единственном экземпляре";
		REPEATED = "наиболее часто встречаются числа:";
		MIN = "наименьшее из них: %d%n";
		
		System.out.println(MESSAGE);
		Out.print(array);
		
		if(array.length == repeatedUnicNumbers.length){
			System.out.println(UNIC);
		} else {
			System.out.println(REPEATED);
			Out.print(repeatedUnicNumbers);
			if (repeatedUnicNumbers.length > 1){
				System.out.printf(MIN, minValue);
			}
		}
	}
}