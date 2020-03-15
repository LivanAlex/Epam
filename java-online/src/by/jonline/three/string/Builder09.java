package by.jonline.three.string;

/*
 * Посчитать количество строчных (маленьких) и прописных (больших)
 * букв в введенной строке. Учитывать только английские буквы.
 */

public class Builder09 {
	
	public static void main(String[] args) {
		String MESSAGE = "в строке \"%s\" %d - строчных, и %d прописных английские букв";
		String source;
		int upperCase;
		int lowerCase;
		
		source = "English Русский";
		
		upperCase = numOfUpperCase(source);
		lowerCase = numOfLowerCase(source);
		
		System.out.printf(MESSAGE, source, lowerCase, upperCase);
		
	}

	private static int numOfLowerCase(String source) {
		
		int counter = 0;
		
		for (int i = 0; i < source.length(); i++) {
			
			char c = source.charAt(i);
			
			boolean isLowerCase = Character.isLowerCase(c);
			boolean isEnglishLetter = (int) c >= 65 && (int) c <= 122;
						
			if (isLowerCase && isEnglishLetter) {
				counter++;
			}
		}

		return counter;
	}

	private static int numOfUpperCase(String source) {
		
		int counter = 0;
		
		for (int i = 0; i < source.length(); i++) {
			
			char c = source.charAt(i);
			
			boolean isUpperCase = Character.isUpperCase(c);
			boolean isEnglishLetter = (int) c >= 65 && (int) c <= 122;
			
			if (isUpperCase && isEnglishLetter) {
				counter++;
			}
		}

		return counter;
	}

}
