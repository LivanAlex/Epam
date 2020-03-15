package by.jonline.three.string;

/*
 *  Проверить, является ли заданное слово палиндромом.
 */

public class Builder03 {
	
	public static void main(String[] args) {
		
		String test;
		
		test = "abba";
		palindromeCheck(test);
		
		test = "qwerty";
		palindromeCheck(test);
		
	}

	private static void palindromeCheck(String test) {
		
		final String MESSAGE = "Слово \"%s\" %s полиндромом\n";
		final String YES = "является";
		final String NO = "не является";
		
		if (isPalindrome(test)) {
			System.out.printf(MESSAGE, test, YES);
		} else {
			System.out.printf(MESSAGE, test, NO);
		}
	}
	
	
	private static boolean isPalindrome(String test) {
		
		StringBuilder a;
		
		a = new StringBuilder();
		a.append(test);
		a.reverse();
	
		return test.contentEquals(a);
	}

}
