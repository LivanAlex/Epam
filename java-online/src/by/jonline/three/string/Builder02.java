package by.jonline.three.string;

/*
 *  В строке вставить после каждого символа 'a' символ 'b'.
 */

public class Builder02 {
	
	public static void main(String[] args) {

		final String MESSAGE = "Строка до преобразования:\n"
				             + "\"%s\"\n"
				             + "Строка после преобразования:\n"
				             + "\"%s\"\n";
		
		String text;
		String textEdited;
		text = "It is a long established fact";
		textEdited = text.replaceAll("a", "ab");
		
		System.out.printf(MESSAGE, text, textEdited);
	}
	
}
