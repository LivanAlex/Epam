package by.jonline.two.array;

import by.jonline.two.array.helper.Generator;
import by.jonline.two.array.helper.Out;

/*
 * 3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an.
 * Требуется переставить элементы так, чтобы они были расположены по убыванию.
 * Для этого в массиве, начиная с первого, выбирается наибольший элемент и
 * ставится на первое место, а первый - на место наибольшего.
 * Затем, начиная со второго, эта процедура повторяется.
 * Написать алгоритм сортировки выбором.
 */



public class Sort03{
	
	public static void main(String[] args) {
		
		int [] arr; 
		arr = new int [10];
		
		Generator.fill(arr, -9, 9);	
		
		Out.print(arr);
		System.out.println("");
		
		sortByChoise(arr);
		
		Out.print(arr);
		System.out.println("");
		
		

	}
	
	private static void sortByChoise(int [] array) {
		for (int i = 0; i < array.length; i++) {
			int max = Integer.MIN_VALUE;
			int indexMax = 0;
			for(int j = i; j < array.length; j++) {
				if (array[j] > max) {
					max = array[j];
					indexMax = j;
				}
			}
			if (i == indexMax) {   // 
				continue;
			} else {
				change(array, i, indexMax);
			}
		}
	}
	
	private static void change(int [] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;	
	}
	
}
