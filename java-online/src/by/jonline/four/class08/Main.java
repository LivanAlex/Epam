package by.jonline.four.class08;

import static by.jonline.four.class08.CustomerLogic.*;

/**
 * 8. Создать класс Customer, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод toString().
 * Создать второй класс, агрегирующий массив типа Customer,
 * с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * 
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Main {

	public static void main(String[] args) {
		
		Customer smirnov = new Customer();
		smirnov.setName("Константин");
		smirnov.setMiddleName("Петрович");
		smirnov.setSurname("Смирнов");
		smirnov.setAddress("ул.Вишневая, д.3");
		smirnov.setCardNum(0000_0000_0000_0001L);
		smirnov.setBankAccountNumber(12345);
		
		Customer kyznetsov = new Customer();
		kyznetsov.setName("Петр");
		kyznetsov.setMiddleName("Викторович");
		kyznetsov.setSurname("Кузнецов");
		kyznetsov.setAddress("ул.Тенистая, д.26, кв. 105");
		kyznetsov.setCardNum(0034_0034_0000_0001L);
		kyznetsov.setBankAccountNumber(54325);
		
		Customer popov = new Customer();
		popov.setName("Виктор");
		popov.setMiddleName("Павлович");
		popov.setSurname("Попов");
		popov.setAddress("ул.Виноградная, д.33, кв. 54");
		popov.setCardNum(1654_3734_8854_2740L);
		popov.setBankAccountNumber(54325);
		
		Customer vasilev = new Customer();
		vasilev.setName("Павел");
		vasilev.setMiddleName("Сергеевич");
		vasilev.setSurname("Васильев");
		vasilev.setAddress("ул.Абрикосовая, д.2, кв. 36");
		vasilev.setCardNum(00234_0034_0000_0001L);
		vasilev.setBankAccountNumber(54325);
		
		showClients();
		
		showByCardInterval(0000_0000_0000_0000L, 1000_0000_0000_0000L);

	}
}
