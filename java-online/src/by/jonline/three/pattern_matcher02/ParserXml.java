package by.jonline.three.pattern_matcher02;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserXml {
	
	final static String OPEN = "[<][^/].*?[>]";       // открывающий тег
	final static String NOBODY = "[<].+?[/][>]";      // тег без тела
	final static String BODY = "(?<=>).+?(?=<)";      // содержимое тега
	final static String CLOSE = "[<][/].+?[>]";       // закрывающий тег
	final static String REGEX = String.format("(%s)|(%s)|(%s)|(%s)", OPEN, CLOSE, NOBODY, BODY);

	ArrayList<String> list;
	private int counter;
	
	public ParserXml(String xml) {
		
		list = new ArrayList<>();

		Pattern pat = Pattern.compile(REGEX);
		Matcher mat = pat.matcher(xml);
		while(mat.find()) {
			list.add(mat.group());
		}
	}
	
	public boolean hasNext() {
		return counter < list.size() ? true : false;
	}
	
	public String next() {
		return analize(list.get(counter++));
	}

	private String analize(String node) {
		final String caseOpen = "открывающий тег";
		final String caseNoBody = "тег без тела";
		final String caseBody = "содержимое тега";
		final String caseClose = "закрывающий тег";
		final String message = "%s - %s\n";
		
		if (check(node, NOBODY)) {
			return String.format(message, node, caseNoBody);
		} else if (check(node, OPEN)) {
			return String.format(message, node, caseOpen);
		} else if (check(node, CLOSE)) {
			return String.format(message, node, caseClose);
		} else {
			return String.format(message, node, caseBody);
		}

	}

	private static boolean check(String node, String reg) {
		Pattern pat = Pattern.compile(reg);
		Matcher mat = pat.matcher(node);
		return mat.find();
	}
}
