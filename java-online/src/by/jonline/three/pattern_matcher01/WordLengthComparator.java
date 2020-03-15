package by.jonline.three.pattern_matcher01;

import java.util.Comparator;

public class WordLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}



}
