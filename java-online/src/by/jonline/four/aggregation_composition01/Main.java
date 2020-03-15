package by.jonline.four.aggregation_composition01;

/**
 * 1. Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class Main {

	public static void main(String[] args) {
		
		Word on = new Word("On");
		Word the = new Word("the");
		Word other = new Word("other");
		Word hand = new Word("hand");
		
		Sentence one = new Sentence();
		one.add(on);  //дополнить предложение
		one.add(the);
		one.add(other);
		one.add(hand);
		
		Word we = new Word("We");
		Word denounce = new Word("denounce");
		Word with = new Word("with");
		Word righteous = new Word("righteous");
		
		Sentence two = new Sentence();
		two.add(we);
		two.add(denounce);
		two.add(with);
		two.add(righteous);
	
		Word indignation = new Word("Indignation");
		Word and = new Word("and");
		Word dislike = new Word("dislike");
		Word men = new Word("men");
		
		Sentence three = new Sentence();
		
		three.add(indignation);
		three.add(and);
		three.add(dislike);
		three.add(men);
		three.setEnding('!');

		Text main = new Text();
		main.add(two);      //дополнить текст
		main.setHeader(one);
		
		main.showHeader();  // on the other hand. (заголовок текста)
		main.show();        // we denounce with righteous. (вывести на консоль текст)
		
		main.add(three);
		
		main.show();        // We denounce with righteous. Indignation and dislike men! (текст)
		
		
		
		
		

		

	}

}
