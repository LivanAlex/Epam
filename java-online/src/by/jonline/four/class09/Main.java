package by.jonline.four.class09;

import static by.jonline.four.class09.BookLogic.*;

/*
 * 9. Создать класс Book, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод toString().
 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * 
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

public class Main {

	public static void main(String[] args) {
		Book one = new Book();
		one.setBook("The Subtle Art of Not Giving a F*ck: "
				+ "A Counterintuitive Approach to Living a Good Life");
		one.setAuthors(new String [] {"Марк Мэнсон"});
		one.setPublisher("Альпина Паблишер");
		one.setYear(2018);
		one.setPages(192);
		one.setPrice(22.33);
		one.setBinding("Мягкая обложка");
		
		Book two = new Book();
		two.setBook("Everything Is F*cked: A Book About Hope");
		two.setAuthors(new String [] {"Марк Мэнсон"});
		two.setPublisher("Альпина Паблишер");
		two.setYear(2019);
		two.setPages(320);
		two.setPrice(22.05);
		two.setBinding("Мягкая обложка");
		
		Book three = new Book();
		three.setBook("Ведьмак. Кровь эльфов. Час презрения");
		three.setAuthors(new String [] {"Анджей Сапковский"});
		three.setPublisher("АСТ");
		three.setYear(2020);
		three.setPages(672);
		three.setPrice(23.15);
		three.setBinding("Твердый переплет");
		
		Book four = new Book();
		four.setBook("Солдаты бесконечных войн");
		four.setAuthors(new String [] {"Грег Бир", "Айра Левин", "Анджей Сапковский", "Джо Холдеман"});
		four.setPublisher("АСТ");
		four.setYear(2018);
		four.setPages(1248);
		four.setPrice(27.10);
		four.setBinding("Твердый переплет");
		
		showAutor("Анджей Сапковский");
		showPublisher("Альпина Паблишер");
		showYearAfter(2020);
	}
}
