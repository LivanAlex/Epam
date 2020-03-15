package by.jonline.three.string;

/*
 * 4. С помощью функции копирования и операции конкатенации
 * составить из частей слова “информатика” слово “торт”.
 */

public class Builder04 {

	public static void main(String[] args) {
		
		final String WORD = "информатика";
		
		String str;
		StringBuilder sb;
		
		str = "";
		sb = new StringBuilder();
		
		sb.append(WORD.charAt(7));
		sb.append(WORD.substring(3, 5));
		sb.append(WORD.charAt(7));
		
		str = str.concat(WORD.substring(7, 8));
		str = str.concat(WORD.substring(3, 5));
		str = str.concat(WORD.substring(7, 8));
		
		
		System.out.println(WORD);
		System.out.println(sb.toString());
		System.out.println(str);
	}
	
}
