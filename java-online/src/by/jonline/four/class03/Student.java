package by.jonline.four.class03;

import static by.jonline.four.class03.StudentLogic.*;

/**
 *  Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
 *  из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 *  номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Student {
	
	private String surname;
	private String initial;
	private String group;
	private int [] marks = new int [5];
	
	public Student() {
		addToArray(this);
	}
	
	public Student(String surname, String initial, String group, int[] marks) {
		this.surname = surname;
		this.initial = initial;
		this.group = group;
		this.marks = marks;
		addToArray(this);
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
}
