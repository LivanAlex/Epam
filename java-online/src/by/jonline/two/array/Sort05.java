package by.jonline.two.array;

/*
 * 5. Сортировка вставками. Дана последовательность чисел a1,a2,..,an.
 * Требуется переставить числа в порядке возрастания.
 * Делается это следующим образом. Пусть a1,a2,..,ai - упорядоченная последовательность, т. е.
 * a1 <= a2 <=...<= an . Берется следующее число ai +1 и вставляется в последовательность так,
 * чтобы новая последовательность была тоже возрастающей.
 * Процесс производится до тех пор, пока все элементы от i +1 до n не будут перебраны.
 * Примечание. Место помещения очередного элемента в отсортированную часть
 * производить с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */

public class Sort05 {

	public static void main(String[] args) {
		
		int[] arr;
		
		arr = new int[13];
		Generator.fill(arr, -9, 9);                 // заполняем случайными значениями от -9 до 9
		Sorter.sortUpArr(arr);                      // сортируем для соответствия условию
		Out.print(arr);                             // выводим на экран
		System.out.println("");
		
		sort(arr);
		
		System.out.println("");
		Out.print(arr);   
	}
	
	public static void sort(int [] array){
		for (int i = 1; i < array.length; i++) {     
			if (array[i] < array[i-1]) {			  // если второй элемент меньше превого, не сортируем
				continue;
			} else {
				int index = binarySearch(array, i);   // ищем куда вставить i-ый элемент массива arr
				insert(index, array, i);              // вставляем i-ый элемент массива arr на место index со cдвигом всех остальных
			}
		}	
	}
	
	public static int binarySearch(int [] array, int i){
		int startIndex = 0;
		int endIndex = i-1;
	    while(startIndex <= endIndex){
	    	int index = (startIndex + endIndex) / 2;
	    	if(array[index] > array[i]) {
	    		startIndex = index + 1;
	    	} else if (array[index] < array[i]) {
	    		endIndex = index - 1;
	    	} else {
	        return index;
	    	}
	    }
	    return startIndex;
	}
	

	private static void insert (int destenationPlace, int [] array, int from) {
		int temp = array[from];
		for (int i = from; i > destenationPlace; i--) {
			array[i] = array[i-1]; 
		}
		array[destenationPlace] = temp;
	}

}
