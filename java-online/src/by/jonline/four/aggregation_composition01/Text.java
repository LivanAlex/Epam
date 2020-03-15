package by.jonline.four.aggregation_composition01;

import java.util.ArrayList;
import java.util.List;

public class Text implements TextOperations<Sentence> {
	
	private List <Sentence> text;
	private Sentence header;
	
	public Text () {
		text = new ArrayList<>();
	}
	
	
	
	public void showHeader() {
		header.show();
		System.out.println("");
	}



	public void setHeader(Sentence header) {
		this.header = header;
	}



	@Override
	public void show () {
		for (int i = 0; i < text.size(); i++) {
			text.get(i).show();
			if (i == text.size()-1) {
				break;
			}
			System.out.print(" ");
		}
		System.out.println("");
	}

	@Override
	public void add(Sentence s) {
		text.add((Sentence) s);
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((header == null) ? 0 : header.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
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
		Text other = (Text) obj;
		if (header == null) {
			if (other.header != null)
				return false;
		} else if (!header.equals(other.header))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Text: ["
				+ "text=" + text.toString()
				+ "header=" + header
				+ "]";
	}
	

}
