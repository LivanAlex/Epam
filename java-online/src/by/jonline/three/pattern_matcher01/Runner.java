package by.jonline.three.pattern_matcher01;

public class Runner {
	
	public static void main(String[] args) {
		String text;
		
		text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
				+ "sed do eiusmod tempor incididunt ut labore et dolore "
				+ "magna aliqua? Egestas fringilla phasellus faucibus "
				+ "scelerisque eleifend donec.     A diam sollicitudin tempor "
				+ "id eu nisl nunc mi ipsum?         Adipiscing elit ut aliquam "
				+ "purus sit amet. Nibh sed pulvinar proin gravida "
				+ "hendrerit lectus a. Nunc vel risus commodo viverra "
				+ "maecenas accumsan lacus. Nibh ipsum consequat nisl "
				+ "vel pretium lectus quam id. Quam lacus suspendisse "
				+ "faucibus interdum posuere lorem. Etiam sit amet nisl "
				+ "purus in mollis nunc sed. Vitae et leo duis ut diam. "
				+ "Hac habitasse platea dictumst quisque sagittis. "
				+ "Sed tempus urna et pharetra pharetra massa massa. "
				+ "Vel quam elementum pulvinar etiam non quam lacus. "
				+ "Lorem ipsum dolor sit amet consectetur adipiscing. "
				+ "Nulla facilisi nullam vehicula ipsum a arcu. "
				+ "Turpis tincidunt id aliquet risus. Id velit ut "
				+ "tortor pretium viverra. Arcu risus quis varius quam "
				+ "quisque id. Eros donec ac odio tempor orci. Amet "
				+ "venenatis urna cursus eget nunc scelerisque viverra "
				+ "mauris in!\n"
				
				+ "Nisi est sit amet facilisis magna etiam tempor orci. "
				+ "Malesuada bibendum arcu vitae elementum curabitur vitae. "
				+ "At quis risus sed vulputate odio ut enim blandit "
				+ "volutpat. Porta non pulvinar neque laoreet suspendisse "
				+ "interdum. Ipsum a arcu cursus vitae congue mauris rhoncus "
				+ "sapien nec sagittis aliquam malesuada bibendum arcu. "
				+ "Neque volutpat ac tincidunt vitae semper quis lectus.\n";
		
		
		System.out.println(text);
		
		String paragraphSortedBySentenceCount;
		String wordSorted;
		String lexemeSorted;
		
		paragraphSortedBySentenceCount = TextProcessor.sortBySentenceCount(text);
		wordSorted = TextProcessor.textWordSort(text);
		lexemeSorted = TextProcessor.textLexemeSort(text, 'e');
		
		System.out.println(paragraphSortedBySentenceCount);
		System.out.println(wordSorted);
		System.out.println(lexemeSorted);
	}

}
