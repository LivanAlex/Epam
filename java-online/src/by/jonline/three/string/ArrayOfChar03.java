package by.jonline.three.string;

/*
 *  В строке найти количество цифр.
 */

public class ArrayOfChar03 {

	public static void main(String[] args) {
		String text;
		final String MESSAGE = "В строке: \"%s\"%n";
		final String NOT_FOUND = "цифр не найдено";
		final String FOUND = "найденых цифр: %d";
		int numCount;
		
		text = "aspernatur aut odit aut fug35it, sed quia 4 consequuntur  4 dolores";
		numCount = numCount(text);
		
		System.out.printf(MESSAGE, text);

		if (numCount != 0) {
			System.out.printf(FOUND, numCount);
		} else {
			System.out.printf(NOT_FOUND);
		}
	}
	
	private static int numCount (String text) {
		int numCount = 0;
		char[] array;
		array = text.toCharArray();
		
		for (int i = 0; i < array.length; i++) {
			if (Character.isDigit(array[i])) {
				numCount++;
			}
		}
		
		return numCount;	
	}
}
