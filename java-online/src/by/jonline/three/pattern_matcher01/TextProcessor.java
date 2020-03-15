package by.jonline.three.pattern_matcher01;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Cоздать приложение, разбирающее текст (текст хранится в строке)
 * и позволяющее выполнять с текстом три различных операции:
 * 
 * отсортировать абзацы по количеству предложений;
 * 
 * в каждом предложении отсортировать слова по длине;
 * 
 * отсортировать лексемы в предложении по убыванию количества вхождений
 * заданного символа, а в случае равенства – по алфавиту.
 */


public abstract class TextProcessor {
	
	public static String sortBySentenceCount(String x) {

		ArrayList<String> paragraphs;
		paragraphs = splitBy(x, ".+[\\n]");
		
		NumOfSentencesComparator com = new NumOfSentencesComparator();
		
		paragraphs.sort(com);
		
		
		String out = "";
		for (String p : paragraphs) {
			out += p;
		}

		return out;	
	}

	
	public static String textLexemeSort(String text, char ch) {
		Pattern sentence = Pattern.compile("[^\\s].+?[.!?]+");
		Matcher mat = sentence.matcher(text);

		while (mat.find()) {
			String beforeSort = mat.group();   	    // предложение, которое будем сортировать
			String afterSort;
			afterSort = lexemeSort(beforeSort, ch);
			text = text.replace(beforeSort, afterSort);	// 
		}
		
		return text;
	}
	
	
	
	private static String lexemeSort(String text, char ch) {

		ArrayList<String> words = new ArrayList<>();  		// лист слов
		ArrayList<String> punktuation = new ArrayList<>();  // лист пунктуации(на всякий случай)
			
		Pattern word = Pattern.compile("[\\w]+");           
		Pattern punkt = Pattern.compile("[\\p{Punct}]");
			
		Matcher matWord = word.matcher(text);
		Matcher matPunkt = punkt.matcher(text);
			
		while (matWord.find()) {
			words.add(matWord.group().toLowerCase());
		}
			
		while (matPunkt.find()) {
			punktuation.add(matPunkt.group());
		}
			
		WordLexemeComparator lex = new WordLexemeComparator(ch);  // компаратор сортирует по заданию
		words.sort(lex);
		String out = ""; // сюда собираем предложение обратно
		for (String w : words) {
			out += w + " "; // слова через пробел
		}
		out = out.trim(); // удаляем последний пробел
		for (String p : punktuation) { // остальная пунктуация(без сортировки)
			out += p;
		}
		
		out = out.replaceFirst(out.substring(0, 1), out.substring(0, 1).toUpperCase()); // заглавная буква
		
		
		return out;
	}
	
	

	public static String textWordSort(String x) {
		//  в каждом предложении отсортировать слова по длине;
		
		ArrayList<String> paragraphs;
		paragraphs = splitBy(x, ".+[\\n]");
		
		String out = "";
		for (String p : paragraphs) {
			out += paragraphWordSort(p) + "\n";
		}

		return out;	
	}

	
	
	private static String paragraphWordSort(String p) {
		
		ArrayList<String> sentences;
		sentences = splitBy(p, ".+?[.!?]+[\\s]+");
		
		String out = "";
		for (String s : sentences) {
			out += sentenceWordSort(s) + " ";
		}
		
		return out;
	}

	
	
	private static String sentenceWordSort(String s) {
		
		ArrayList<String> words;
		ArrayList<String> punctuation;
		words = splitBy(s, "[\\w]+");
		punctuation = splitBy(s, "[\\p{Punct}]");
		
		WordLengthComparator comp = new WordLengthComparator();
		words.sort(comp);
		
		String out = "";
		for (String w : words) {
			out += w + " ";
		}

		out = out.trim();
		
		for (String p : punctuation) {
			out += p;
		}
		
		return out;
	}
	

	
	private static ArrayList<String> splitBy(String str, String pattern){
		ArrayList<String> list = new ArrayList<>();
		Pattern pat = Pattern.compile(pattern);
		Matcher mat = pat.matcher(str);
		
		while (mat.find()) {
			list.add(mat.group());
		}
		return list;
	}
}
	
	