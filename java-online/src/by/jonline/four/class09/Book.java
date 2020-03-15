package by.jonline.four.class09;

import static by.jonline.four.class09.BookLogic.*;

import java.util.Arrays;

/**
 * Book: id, название, автор(ы), издательство, год издания,
 * количество страниц, цена, тип переплета.
 */

public class Book {
	
	private static int counter = 0;
	private int id;
	private String book;
	private String [] authors;
	private String publisher;
	private int year;
	private  int pages;
	private  double price;
	private String binding;
	
	public Book () {
		setBookStore(this);
		id = ++counter;
	}
	
	public Book (int id, String book, String [] authors, String publisher, int year, int pages, double price, String binding) {
		this.id = id;
		this.book = book;
		this.authors = authors;
		this.publisher = publisher;
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.binding = binding;
		id = ++counter;
	}
	
	public void setId (int id) {
		this.id = id;
	}
	
	public int getId () {
		return id;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void setYear (int year) {
		this.year = year;
	}
	
	public int getYear () {
		return year;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", book=" + book + ", authors=" + Arrays.toString(authors) + ", publisher="
				+ publisher + ", year=" + year + ", pages=" + pages + ", price=" + price + ", binding=" + binding + "]";
	}
	
}
