package by.jonline.four.class02;

/*
 *  2. Создйте класс Test2 двумя переменными.
 *  Добавьте конструктор с входными параметрами.
 *  Добавьте конструктор, инициализирующий члены класса по умолчанию.
 *  Добавьте set- и get- методы для полей экземпляра класса.
 */

public class Simple02 {
	
	private int a;
	private int b;
	
	public Simple02(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public Simple02() {
		a = 23;
		b = 55;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}
