package by.jonline.four.class06;

/*
 * 6. Составьте описание класса для представления времени.
 * Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
 * с проверкой допустимости вводимых значений.
 * В случае недопустимых значений полей поле устанавливается в значение 0.
 * Создать методы изменения времени на заданное количество часов, минут и секунд.
 */

public class Main {

	public static void main(String[] args) {
	
	String fullTime = "Николай";
	Time v = new Time(fullTime);
	v.printTime();
	System.out.printf(" - установка времни в значение \"%s\"\n\n", fullTime);
	
	fullTime = "7";
	v.setTime(fullTime);
	v.printTime();
	System.out.printf(" - установка времни в значение \"%s\"\n\n", fullTime);
	
	fullTime = "26:00:00";
	v.setTime(fullTime);
	v.printTime();
	System.out.printf(" - установка времни в значение \"%s\"\n\n", fullTime);
	
	fullTime = "00:65:00";
	v.setTime(fullTime);
	v.printTime();
	System.out.printf(" - установка времни в значение \"%s\"\n\n", fullTime);
	
	fullTime = "00:00:100";
	v.setTime(fullTime);
	v.printTime();
	System.out.printf(" - установка времни в значение \"%s\"\n\n", fullTime);
	
	fullTime = "22:22:22";
	v.setTime(fullTime);
	v.printTime();
	System.out.printf(" - установка времни в значение \"%s\"\n", fullTime);
	
	
	int zero = 0;
	v.setMinutes(zero);
	v.printTime();
	System.out.printf(" - установка минут в значение \"%d\"\n", zero);
	
	v.setHours(zero);
	v.printTime();
	System.out.printf(" - установка часов в значение \"%d\"\n", zero);
	
	v.setSeconds(0);
	v.printTime();
	System.out.printf(" - установка секунд в значение \"%d\"\n", zero);
	
	int minutes = -2;
	
	v.addMinutes(minutes);
	v.printTime();
	System.out.printf(" - изменение минут (%d)\n", minutes);
	
	int seconds = 121;
	
	v.addSeconds(seconds);
	v.printTime();
	System.out.printf(" - изменение секунд (%d)\n", seconds);
	
	seconds = 10000;
	
	v.addSeconds(seconds);
	v.printTime();
	System.out.printf(" - изменение секунд (%d)\n", seconds);
	
	
	int hours = 2;
	v.addHours(hours);
	v.printTime();
	System.out.printf(" - изменение часов (%d)\n", hours);
	}
}
