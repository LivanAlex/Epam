package by.jonline.two.array;

import by.jonline.two.array.helper.Generator;
import by.jonline.two.array.helper.Out;

/*
 * Дан целочисленный массив с количеством элементов п.
 * Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
 * Примечание. Дополнительный массив не использовать.
 */

public class Arrays10 {

	public static void main (String[] args) {
		
		int n;
		int [] arr;
		final String BEFORE;
		final String AFTER;
		
		BEFORE = "Массив до сжатия:";
		AFTER = "Массив после сжатия:";
		n = 10;
		arr = Generator.randomIntArray(n, -9, 9);

		
		System.out.println(BEFORE);
		
		Out.printWithSpaces(arr);
		
		squeeze(arr);
		
		System.out.println(AFTER);
		
		Out.printWithSpaces(arr);	
	}
	
	private static void squeeze(int [] arr){
		
		for (int i = 1, j = 2; i < arr.length; i++, j += 2){
			if (i < (arr.length/2 + arr.length%2)){
				arr[i] = arr[j];
			} else {
				arr[i] = 0;
			}		
		}
	}
}

