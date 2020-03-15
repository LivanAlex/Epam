package by.jonline.three.string;

/*
 * 4. В строке найти количество чисел.
 */

public class ArrayOfChar04 {

	public static void main(String[] args) {
		String text;
		final String MESSAGE = "В строке: \"%s\"%n";
		final String NOT_FOUND = "цифр не найдено";
		final String FOUND = "найденых чисел: %d";
		int numCount;
		
		text = "В этом тексте числом будет считаться 1 цифра, или несколько (100) цифр без пробелов";
		numCount = findCountOfNum(text);
		
		System.out.printf(MESSAGE, text);

		if (numCount != 0) {
			System.out.printf(FOUND, numCount);
		} else {
			System.out.printf(NOT_FOUND);
		}
		
	}
	
	
	
	private static int findCountOfNum(String num) {
		char[] temp;
		int counter;
		
		temp = num.toCharArray();
		counter = findCountOfNum(temp);
		
		return counter;	
	}
	
	
	
	private static int findCountOfNum(char[] array) {
		int globalCounter;
		globalCounter = 0;
		for (int i = 0; i < array.length; i++) {
			if (Character.isDigit(array[i])) {
				if (i == array.length - 1) {
					
					if (neighborsCheck(array, i - 1, i + 1)) {  // проверка последней цифры
						globalCounter++;
					}
					break;
				}
				
				int j = i;
				while (Character.isDigit(array[j])) {
					j++;
					if (j == array.length) {
						break;
					}
				}
				
				if (neighborsCheck(array, i - 1, j)) {
					globalCounter++;
					i = j;
				}
			}
		}
		
		return globalCounter;
	}


	// проверка соседних с числом значений
	private static boolean neighborsCheck(char[] array, int start, int end) {

		boolean startTrue;
		boolean endTrue;
		
		startTrue = true;
		endTrue = true;
		
		if (start > 0) {
			if(!Character.isDigit(array[start])) {
				
				startTrue = true;
			} else {
				startTrue = false;
			}
		}
		
		if (end < array.length) {
			if(!Character.isDigit(array[end])) {
				
				endTrue = true;
			} else {
				endTrue = false;
			}
		}
		
		return startTrue & endTrue;
	}

	
}
