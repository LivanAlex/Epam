package by.jonline.two.array;

/*
 * 2. Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm .
 * Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
 * Примечание. Дополнительный массив не использовать.
 */

public class Sort02 {


	public static void main(String[] args) {
		int n = 8;
		int m = 4;
		int [] arrOne;
		int [] arrTwo;
		int [] arrOut;
		
		arrOne = new int [n];
		arrTwo = new int [m];
		arrOut = new int [n+m];
		
		Generator.fill(arrOne, -5, 8);
		Generator.fill(arrTwo, -9, 9);
		
		Sorter.sortUpArr(arrOne);
		Sorter.sortUpArr(arrTwo);
		
		Out.print(arrOne);
		System.out.println("");
		Out.print(arrTwo);
		System.out.println("");

		
		arrOut = insertDownSort(arrOne, arrTwo, n+m);
		
		printArr(arrOut);
		

	}
	
	private static int[] insertDownSort (int [] arrayOne, int [] arrayTwo, int arrayLength){
		
		int [] arrayOut = new int [arrayLength];
	
		for(int i = 0, a = 0, b = 0; i < arrayLength; i++) {
			if (a < arrayOne.length && b < arrayTwo.length) {  // если в обоих массивах остались числа 
				if (arrayOne[a] <= arrayTwo[b]) {			   // записываем меньшее
					arrayOut[i] = arrayOne[a];
					a++;
				} else {
					arrayOut[i] = arrayTwo[b];
					b++;
				}
			} else if (a == arrayOne.length) {			       // сценарий при котором в первом массиве закончились числа
				arrayOut[i] = arrayTwo[b];
				b++;
			} else if (b == arrayTwo.length) {				   // сценарий при котором во втором массиве закончились числа
				arrayOut[i] = arrayOne[a];
				a++;
			}
		}
		
		return arrayOut;
	}
	
	private static  void printArr(int array[]) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

}
