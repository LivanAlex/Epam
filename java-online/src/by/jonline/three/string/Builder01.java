package by.jonline.three.string;

/*
 *  1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

public class Builder01{
	public static void main(String[] args) {
		String MESSAGE = "В тексте:\n\n%s\nнаибольшее количество пробелов идущих подряд: %d";
		String text;
		int max;
		int counter;
		text = "Один пробел \" \"\nДва пробела \"  \"\nТри пробела \"   \"\n";
		max = 0;
		counter = 0;
		for(int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '\u0020') {
				counter++;
				if (counter > max) {
					max = counter;
				}
			} else {
				counter = 0;
			}
		}
		System.out.printf(MESSAGE, text, max);
	}
	
}
