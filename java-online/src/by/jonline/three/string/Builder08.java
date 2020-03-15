package by.jonline.three.string;

/*
 * Вводится строка слов, разделенных пробелами.
 * Найти самое длинное слово и вывести его на экран.
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */

public class Builder08 {
	
	public static void main(String[] args) {
		
		String input;
		String output;
		
		input = "Найти самое длинное слово и вывести его на экран";
		output = longestWord(input);
		
		System.out.println(input);
		System.out.println(output);
	}

	private static String longestWord(String input) {
		
		String[] array;
		String output;
		int max;
		
		array = input.split("\\b");
		max = 0;
		output = "";
		
		for (String str : array) {
			if (str.length() > max) {
				max = str.length();
				output = str;
			}
		}
		
		return output;
	}
}
