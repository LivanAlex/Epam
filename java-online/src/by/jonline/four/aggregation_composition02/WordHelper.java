package by.jonline.four.aggregation_composition02;

public class WordHelper {
	private final String word1;
	private final String word2;
	private final String word3;
	
	public WordHelper(String word1, String word2, String word3){
		this.word1 = word1;
		this.word2 = word2;
		this.word3 = word3;
	}
	
	public String get(int num){
		int x = num % 100;
		if (x > 10 && x < 20) {
			return word3;
		} else if (x % 10 == 1) {
			return word1;
		} else if (x % 10 > 4 || x % 10 == 0) {
			return word3;
		} else {
			return word2;
		}
	}
}
