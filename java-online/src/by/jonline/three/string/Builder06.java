package by.jonline.three.string;

/*
 * Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class Builder06 {

	public static void main(String[] args) {
		String source;
		String out;
		source = "строка";
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < source.length(); i++) {
			sb.append(source.charAt(i));
			sb.append(source.charAt(i));
		}
		
		out = sb.toString();
		System.out.println(out);
	}
}
