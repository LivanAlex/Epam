package by.jonline.four.class09;

import java.util.ArrayList;


public abstract class BookLogic {
	
	private static ArrayList <Book> bookStore = new ArrayList <>();
	
	public static void setBookStore(Book book) {
		bookStore.add(book);
	}
	
	
	
	public static void showAutor (String author) {
		System.out.println("Книги автора " + author);
		boolean isExist = true;
		for (Book i : bookStore) {
			for (int j = 0; j < i.getAuthors().length; j++) {
				if (author.equals(i.getAuthors()[j])) {
					System.out.println("\"" + i.getBook() + "\"");
					isExist = false;
				}
			}
		}
		if (isExist) System.out.println("не найдены");
		System.out.println("");
	}
	
	public static void showPublisher (String publisher) {
		System.out.println("Книги издательства " + publisher);
		boolean isExist = true;
		for (Book i : bookStore) {
			if (publisher.equals(i.getPublisher())) {
				System.out.println("\"" + i.getBook() + "\"");
				isExist = false;
			}
		}
		if (isExist) System.out.println("не найдены");
		System.out.println("");
	}
	
	public static void showYearAfter (int year) {
		System.out.println("Книги выпущеные с " + year + " года:");
		boolean isExist = true;
		for (Book i : bookStore) {
			if (year <= i.getYear()) {
				System.out.println("\"" + i.getBook() + "\"");
				isExist = false;
			}
		}
		if (isExist) System.out.println("не найдены");
		System.out.println("");
	}

}
