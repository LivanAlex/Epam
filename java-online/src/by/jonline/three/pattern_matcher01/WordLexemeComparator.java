package by.jonline.three.pattern_matcher01;

import java.util.Comparator;

public class WordLexemeComparator implements Comparator<String>{

	private char ch;
	 
	public WordLexemeComparator(char ch) {
		this.ch = ch;
	}
	
	public void setCh (char ch) {
		this.ch = ch;
	}
	
	@Override
	public int compare(String o1, String o2) {
		if(countOfChar(o2) == countOfChar(o1)) {
			return o1.compareTo(o2);
		}
		
		return countOfChar(o2) - countOfChar(o1);
	}
	
	private int countOfChar(String string) {
		int counter = 0;
		counter = string.length() - string.replaceAll(ch + "", "").length();
		
		return counter;
	}
	
}
