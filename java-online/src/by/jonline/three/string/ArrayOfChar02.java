package by.jonline.three.string;

/*
 * Замените в строке все вхождения 'word' на 'letter'.
 */


public class ArrayOfChar02 {
	
	
	public static void main(String[] args) {
		String text;
		String from;
		String to;
		
		text = "My word, probably, is my sword!";
		from = "word";
		to = "leter";
		
		System.out.println(text);
		
		text = replase(text, from, to);
		
		System.out.println(text);
	}

	
	
	private static String replase(String text, String from, String to) {
		
		char[] source;
		char[] pattern;
		char[] replasment;
		
		String result;
		
		source = text.toCharArray();
		pattern = from.toCharArray();
		replasment = to.toCharArray();
				
		source = replaseAll(source, pattern, replasment);
		result = charToString(source);
		
		return result;
	}

	
	// заменяет все вхождения
	private static char[] replaseAll(char[] source, char[] pattern, char[] replasment) {
		
		while (source != (replaseFirst(source, pattern, replasment))) {
			source = replaseFirst(source, pattern, replasment);
		}
		return source;
	}
	
	
	// заменяет первое вхождение
	private static char[] replaseFirst(char[] source, char[] pattern, char[] replasment) {
		for (int i = 0; i < source.length; i++) {
			if (source[i] == pattern[0]) {
				int counter;
				counter = 0;
				for (int j = i, k = 0; k < pattern.length; j++, k++) {
					if (source[j] == pattern[k]) {
						counter++;
					}
				}
				if (counter == pattern.length) {
					int start;
					int finish;
					start = i;
					finish = start + pattern.length;
					if(valuesCheck(source, start, finish)) {
						source = replase(source, replasment, start, finish);
						return source;
					}	
				}
				
			}
		}
		return source;
	}

	
	// проверка соседних значений на знаки препинания и пробел
	private static boolean valuesCheck(char[] source, int start, int finish) {
		

		boolean isChecked;
		boolean firstCheck;
		boolean secondCheck;
		
		firstCheck = true;
		secondCheck = true;
		
		if (start != 0) {

			if (Character.isWhitespace(source[start-1]) ||
				!Character.isJavaIdentifierPart(source[start-1])) {
				firstCheck = true;
			} else {
				firstCheck = false;
			}
			
		}
		
		if (finish < source.length) {

			if (Character.isWhitespace(source[finish]) ||
				!Character.isJavaIdentifierPart(source[finish])) {
				secondCheck = true;
			} else {
				secondCheck = false;
			}

		}
		
		
		
		isChecked = firstCheck && secondCheck;
		return isChecked;
	}



	private static char[] replase(char[] source, char[] replasment, int start, int finish) {
		

		char[] result;
		char[] begin;
		char[] end;
		
		begin = arrayBeforeIndex(source, start);
		end = arrayStartIndex(source, finish);
		
		result = concat(begin, replasment, end);
		return result;
	}

	
	
	private static String charToString(char[] array) {
		String result;
		result = "";
		for (char c : array) {
			result += c;
		}
		return result;
	}
	
	
	
	private static char[] arrayBeforeIndex(char[] array, int index) {
		char[] result;
		result = new char[index];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = array[i];
		}

		return result;
	}
	
	
	
	private static char[] arrayStartIndex(char[] array, int index) {
		char[] result;
		result = new char[array.length - index];
		
		for (int i = 0, j = index; i < result.length; i++) {
			result[i] = array[j];
			j++;
		}

		return result;
	}
	
	
	
	private static char[] concat(char[] first, char[] second) {
		
		char[] result;
		int length;
		
		length = first.length + second.length;
		result = new char[length];
		
		for (int i = 0; i < first.length; i++) {
			result[i] = first[i];
		}
		
		for (int i = first.length, j = 0; i < length; i++) {
			result[i] = second[j];
			j++;
		}
		
		return result;
	}
	
	
	
	private static char[] concat(char[] first, char[] second, char[] third) {
		char[] result;
		
		result = concat(first, second);
		result = concat(result, third);
		
		return result;
	}


}
