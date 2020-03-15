package by.jonline.three.string;

/*
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих
 * пробелов заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить.
 */

public class ArrayOfChar05{

	public static void main(String[] args) {
		
		final String MESSAGE = "Пробелы удалены! символ переноса на новую строку \"\\n\" остался:\n";
		
		String string;
		
		string = "   Один пробел \" \"\nДва пробела \"  \"\nТри пробела \"   \"\n      ";
		
		System.out.println(string);
		
		System.out.println(MESSAGE);

		string = trim(string);
		string = removeDoubleWhitespaces(string);
		
		System.out.println(string);
	}

	
	private static String removeDoubleWhitespaces(String one) {
		char[] array;
		array = one.toCharArray();
		array = removeDoubleWhitespaces(array);
		return charToString(array);
	}


	private static char[] removeDoubleWhitespaces(char[] array) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '\u0020') {
				//System.out.println(i);	
				
				int j;
				j = i;
				while (array[j] == '\u0020') {
					j++;
					if (j == array.length) {
						break;
					} 
				}
				
				if (j > i) {
					char[] start;
					char[] end;
					
					start = cutEnding(array, i);
					end = cutBegining(array, j);
					
					array = merge(start, end);
				}
			}
		}
		return array;
	}
	
	


	private static char[] merge(char[] start, char[] end) {
		char[] result;
		result = new char[start.length + end.length];
		for (int i = 0, k = 0; i < result.length; i++) {
			if (i < start.length) {
				result[i] = start[i];
			} else {
				result[i] = end[k];
				k++;
			}
		}
		return result;
	}


	private static String trim(String one) {
		char[] array;
		array = one.toCharArray();
		array = trim(array);
		return charToString(array);
	}


	private static String charToString(char[] array) {
		String str = "";
		for (char c : array) {
			str += c;
		}
		return str;
	}
	
	
	private static char[] trim(char[] array) {
		
		if (array.length == 0) {
			return array;
		}
		
		int i;
		
		i = 0;
		while (Character.isWhitespace(array[i])) {
			i++;
			if (i == array.length - 1) {
				return new char[0];
			}
		}
				
		array = cutBegining(array, i);
		
		i = array.length-1;
		while (Character.isWhitespace(array[i])) {
			i--;
			if (i == -1) {
				return new char[0];
			}
		}
		
		array = cutEnding(array, i);

		
		return array;
	}
	
	
	
	private static char[] cutBegining(char[] array, int startIndex) {
		char[] result;
		result = new char [array.length - startIndex];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = array[i+startIndex];
		}
		return result;
	}
	
	private static char[] cutEnding(char[] array, int lastIndex) {
		char[] result;
		result = new char [lastIndex+1];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = array[i];
		}
		return result;
	}
	
}
