package by.jonline.three.pattern_matcher01;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumOfSentencesComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return sentenceNum(o1) - sentenceNum(o2);
	}
	
	private int sentenceNum(String str) {
		Pattern pat = Pattern.compile("[^\\s].+?[.!?]+");
		Matcher mat = pat.matcher(str);
		int counter = 0;
		while (mat.find()) {
			counter++;
		}	
		return counter;
	}

}
