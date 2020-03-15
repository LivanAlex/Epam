package by.jonline.four.class10;

import static by.jonline.four.class10.AirlineLogic.*;

/**
 * 10. Создать класс Airline, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод toString().
 * Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * 
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * 
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Main {

	public static void main(String[] args) {

		Airline one = new Airline("Анапа", 235, "Boeng747", "04:55", "вс, суббота, пн");
		
		Airline two = new Airline();
		two.setDestination("Анапа");
		two.setFlightNumber(155);
		two.setAirplane("Boeng737");
		two.setTime("15:03");
		two.setDay("среда");
		
		Airline three = new Airline();
		three.setDestination("Калуга");
		three.setFlightNumber(701);
		three.setAirplane("Aerobus A320");
		three.setTime("12:20");
		three.setDay("пн");
		
		findPlaneByDestination("Анапа");
		
		findPlaneByDay("понедельник");
		
		findPlaneByDay("понедельник", "12:00");
	}
}
