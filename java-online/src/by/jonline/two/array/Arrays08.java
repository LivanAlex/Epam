package by.jonline.two.array;

/* Дана последовательность целых чисел a1,a2,...,an.
 * Образовать новую последовательность, выбросив из исходной те члены,
 * которые равны min(a1,a2,...,an).
 */

public class Arrays08 {


	public static void main(String[] args) {
		
		int [] arr;
		int [] arrOut;
		
		arr = Generator.randomIntArray(10, 10, 20);
		
		Out.print(arr);
		
		arrOut = calculate(arr);
		
		Out.print(arrOut);

	}


	
	private static int[] calculate(int[] array) {
		int min;
		int counter;
		int arrOut[];
		
		min = findMin(array);
		counter = findCountOfNum(array, min);
		
		arrOut = new int [array.length-counter];
		int j = 0;
		for (int i : array){
			if (i == min){
				continue;
			}
			arrOut[j] = i;
			j++;
		}
		
		return arrOut;
	}
	
	private static int findMin(int[] array) {
		int min;
		min = Integer.MAX_VALUE;
		for (int i: array){
			if (i < min){
				min = i;
			}
		}
		return min;
	}
	
	private static int findCountOfNum(int[] array, int num) {
		int counter;
		counter = 0;
		for (int i: array){
			if (i == num){
				counter++;
			}
		}
		return counter;
	}

}
