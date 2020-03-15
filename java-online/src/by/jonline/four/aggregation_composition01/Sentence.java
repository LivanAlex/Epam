package by.jonline.four.aggregation_composition01;

import java.util.ArrayList;
import java.util.List;

import by.jonline.four.aggregation_composition01.Word;

public class Sentence implements TextOperations<Word> {
	
	private List <Word> sentence;
	private char ending;
	
	public Sentence () {
		sentence = new ArrayList<>();
		ending = '.';
	}

	public char getEnding() {
		return ending;
	}

	public void setEnding(char ending) {
		this.ending = ending;
	}

	@Override
	public void add(Word w) {
		sentence.add(w);	
	}
	
	@Override
	public void show() {
		for (int i = 0; i < sentence.size(); i++) {
			sentence.get(i).show();
			if (i == sentence.size()-1) {
				break;
			}
			System.out.print(" ");
		}
		System.out.print(ending);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ending;
		result = prime * result + ((sentence == null) ? 0 : sentence.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (ending != other.ending)
			return false;
		if (sentence == null) {
			if (other.sentence != null)
				return false;
		} else if (!sentence.equals(other.sentence))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Sentence: ["
				+ "sentence=" + sentence.toString() + ", "
				+ "ending=" + ending + "]";
	}



	
	
}
