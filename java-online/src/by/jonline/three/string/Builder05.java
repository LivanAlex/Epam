package by.jonline.three.string;

/*
 * 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

public class Builder05 {

	public static void main(String[] args) {
		
		final String MESSAGE = "В строке: \"%s\"\nбуква \"%s\" встречается %d %s";

		String str;
		String raz;
		String a;
		int counter;
		
		str = "Подсчитать, сколько раз среди символов...";
		a = "а";
		counter = 0;
		
		counter = str.length();
		counter -= str.replaceAll(a, "").length();
		

		raz = rightWord(counter);
		System.out.printf(MESSAGE, str, a, counter, raz);
		
		
		
	}
	
	private static String rightWord(int num) {
		
		final String YES = "раза";
		final String NO = "раз";
		boolean one;
		boolean two;
		
		num = Math.abs(num);
		one = num % 10 > 1 && num % 10 < 5;          //    все что заканчивается на 2, 3, 4
		two = !(num % 100 > 10 && num % 100 < 20);   //    исключая 12, 13, 14
		
		return one & two ? YES : NO;
	}
	
	
}
