package by.jonline.four.class05;

/**
 * 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
 * на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
 * произвольными значениями.Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее
 * получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

public class Main {

	public static void main(String[] args) {
		
		Counter a = new Counter();
		System.out.format("конструктор по умолчанию: %d\n", a.getCounter());
		
		Counter b = new Counter(5);
		System.out.format("конструктор с аргументом 5: %d\n", b.getCounter());
		
		a.setCounter(3);
		System.out.format("сеттер с аргументом 3: %d\n", a.getCounter());
		
		a.increase();
		System.out.format("инкрементация значения 3: %d\n", a.getCounter());
		
		a.decrease();
		System.out.format("декрементация значения 4: %d\n", a.getCounter());
	}

}
