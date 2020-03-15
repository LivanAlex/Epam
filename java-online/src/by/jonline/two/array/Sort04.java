package by.jonline.two.array;

/*
 * 4. Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= an. 
 * Требуется переставить числа в порядке возрастания.
 * Для этого сравниваются два соседних числа ai и ai+1 .
 * Если ai > ai+1 , то делается перестановка.
 * Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */


public class Sort04 {
	
	public static void main(String[] args) {
		
		int [] arr = new int [7];
		int counter = 0;
		final String MESSAGE;
		
		MESSAGE = "для сортировки было проведено %d перестановок";
		Generator.fill(arr, 0, 9);	
		Out.print(arr);
		System.out.println("");
		
		counter = sortByChange(arr);
		
		Out.print(arr);
		System.out.println("");
		System.out.printf(MESSAGE, counter);
		

	}
	public static int sortByChange(int array[]){
		int counter;
		counter = 0;
		for (int i = array.length; i > 0; i--){
			for(int j = 1; j < i; j++){
				if (array[j] > array[j-1]){
					change(array, j);
					counter++;
				}
			}			
		}
		return counter;
	}
	
	private static void change(int [] array, int a) {
		int temp = array[a -1];
		array[a - 1] = array[a];
		array[a] = temp;	
	}
	

}
