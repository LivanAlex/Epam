package by.jonline.four.class08;

import java.util.ArrayList;
import java.util.Comparator;

import by.jonline.four.class08.Customer;

/*
 * Создать второй класс, агрегирующий массив типа Customer,
 * с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public abstract class CustomerLogic {
	
	private static ArrayList <Customer> clients = new ArrayList <>();

	
	/** Adds a new customer to clients List */
	public static void addClient (Customer customer) {
		clients.add(customer);
	}
	
	
	/** Sorts clients List by surname, name and middle name and prints it  */
	public static void showClients () {
		clients.sort(Comparator
				.comparing(Customer::getSurname)
				.thenComparing(Customer::getName)
				.thenComparing(Customer::getMiddleName));
		for (Customer c : clients) {
			printClients(c);
		}
		System.out.println("");
	}
	
	
	private static void printClients(Customer c) {
		System.out.format("%s %s %s\n", c.getSurname(), c.getName(), c.getMiddleName());
	}
	
	
	/** Prints clients List by (a,b) interval of CardNum field  */
	public static void showByCardInterval (long a, long b) {
		if (a > b) {
			long temp = a;
			a = b;
			b = temp;
		}
		for (Customer c : clients) {
			if (c.getCardNum() > a && c.getCardNum() < b) {
				printClients(c);
			}
		}
		System.out.println("");
	}
}
