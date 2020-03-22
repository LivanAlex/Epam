package by.jonline.two.array;

import by.jonline.two.array.helper.Generator;
import by.jonline.two.array.helper.Out;

/*
 * 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
 * Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
 * при этом не используя дополнительный массив.
 */


public class Sort01 {


	public static void main(String[] args) {
		
		int [] arrOne;
		int [] arrTwo;
		int [] arrOut;
		int k;
		int arrOneLength;
		int arrTwoLength;
		final String ARRAY;
		final String PUT_IN;
		final String AFTER;
		
		ARRAY = "массив:";
		PUT_IN = "вставляем в массив:";
		AFTER = "после эллемента с индексом %d:\n";
		
		arrOneLength = Generator.randomInt(2, 9);  // случайное положительное число элементов первого массива
		arrOne = new int [arrOneLength];
		Generator.fill(arrOne, -9, -1);            // заполняем отрицательными цифрами (для наглядности)

		
		arrTwoLength = Generator.randomInt(2, 9);  // случайное положительное число элементов первого массива
		arrTwo = new int [arrTwoLength];
		Generator.fill(arrTwo, 1, 9);              // заполняем положительными цифрами (для наглядности)
		
		
		// случайное К (от 0 до последнего индекса массива в который будем вставлять второй массив):
		k = Generator.randomInt(0, arrOneLength-1);
		
		
		System.out.println(ARRAY);
		Out.print(arrTwo);

		System.out.println(PUT_IN);
		Out.print(arrOne);
		System.out.printf(AFTER, k);

		arrOut = insertArr(arrOne, arrTwo, k);
		Out.print(arrOut);

	}
	
	private static int[] insertArr (int [] arrayIn, int [] arrayFrom, int indexOfarrayIn){
		
		int [] arrayOut = new int [arrayIn.length+arrayFrom.length];
		
		for(int i = 0, a = 0, b = 0; i < arrayOut.length; i++) {
			if (i < indexOfarrayIn+1) {
				arrayOut[i] = arrayIn[a];
				a++;
			} else if (b < arrayFrom.length) {
				arrayOut[i] = arrayFrom[b];
				b++;
			} else {
				arrayOut[i] = arrayIn[a];
				a++;
			}
			
		}

		return arrayOut;
	}
}
