package by.jonline.three.string;

/*
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */

public class Builder07 {

	public static void main(String[] args) {
		
		String input;
		String output;
		
		input = "abc cde def";
		
		System.out.println(input);
		
		output = input.replaceAll("\\s", "");
		
		System.out.println(output);
		
		StringBuilder sb = new StringBuilder();
		sb.append(output);
		sb = deleteRepeats(sb);
		output = sb.toString();
		
		System.out.println(output);
		
	}
	
	private static StringBuilder deleteRepeats(StringBuilder sb) {
		for (int i = 0; i < sb.length(); i++) {
			
			String cursor;
			int lastRepeaded;
			
			cursor = "" + sb.charAt(i);
			lastRepeaded = sb.lastIndexOf(cursor);
			
			if(i != lastRepeaded) {
				sb = sb.deleteCharAt(lastRepeaded);
				sb = deleteRepeats(sb);
			}
		}
		return sb;
	}
}
