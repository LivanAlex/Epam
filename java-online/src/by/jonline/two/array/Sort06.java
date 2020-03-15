package by.jonline.two.array;

/*
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента ai и ai+1
 * Если ai <= ai+1, то продвигаются на один элемент вперед.
 * Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 */

public class Sort06 {
	
	public static void main(String[] args) {
		
		double [] arr;
		
		arr = new double [7];
		Generator.fill(arr, -9, 9);
		Out.printWithSpaces(arr, 2);       // выводим на экран массив с 2-мя десятичными знаками
		
		sortShell(arr);
		
		System.out.println("");
		Out.printWithSpaces(arr, 2);
	
	}
	
	private static void sortShell(double [] array) {
		for (int i = 1; i < array.length; i++ ) {
			if (array[i-1] > array[i]) {
				int temp = i;
				while (array[i-1] > array[i]) {
					change(array, i);
					if (i > 1) {
						i--;
					}
				}
				i = temp;
			}
		}
	}
	
	private static void change(double [] array, int index) {
		double temp = array[index];
		array[index] = array[index - 1];
		array[index - 1] = temp;
	}

}
