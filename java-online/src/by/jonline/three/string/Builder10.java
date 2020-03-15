package by.jonline.three.string;

/*
 *  10. Строка X состоит из нескольких предложений,
 *  каждое из которых кончается точкой, восклицательным или вопросительным знаком.
 *  Определить количество предложений в строке X.
 */

public class Builder10 {
	
	
	
	public static void main(String[] args) {
		
		String str = "Ночь. Улица? Фонарь? Аптека!";
		int num = numOfSentences(str);
		
		System.out.println(num);
		
	}

	private static int numOfSentences(String str) {
		String[] array;
		array = str.split("[.?!]");
		return array.length;
	}
	
	


}
