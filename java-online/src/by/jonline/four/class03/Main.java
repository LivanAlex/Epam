package by.jonline.four.class03;

import static by.jonline.four.class03.StudentLogic.*;

/*
 *  Создайте класс с именем Student, содержащий поля:
 *  фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
 *  Создайте массив из десяти элементов такого типа.
 *  Добавьте возможность вывода фамилий и номеров групп студентов,
 *  имеющих оценки, равные только 9 или 10.
 */

public class Main {
	public static void main(String[] args) {	
		Student ivanov = new Student();
		ivanov.setSurname("Иванов");
		ivanov.setInitial("В.С.");
		ivanov.setGroup("4Н3");
		ivanov.setMarks(new int[] {1,2,3,4,5});
		
		Student smirnov = new Student("Смирнов","К.П.", "5М2", new int[] {10,10,10,10,10});
		Student kyznetsov = new Student("Кузнецов","П.В.", "2П1", new int[] {1,2,3,4,5});
		Student popov = new Student("Попов","В.П.", "4Н3", new int[] {9,9,8,9,9});
		Student vasilev = new Student("Васильев","П.С.", "5М2", new int[] {1,2,3,4,5});
		Student petrov = new Student("Петров","С.М.", "2П1", new int[] {9,9,9,9,9});
		Student sokolov = new Student("Соколов","М.Н.", "4Р1", new int[] {1,2,3,4,5});
		Student mihailov = new Student("Михайлов","Н.Ф.", "4П4", new int[] {1,2,3,4,5});
		Student novikov = new Student("Новиков","Ф.И.", "4Р1", new int[] {10,10,10,10,9});
		Student fedorov = new Student("Федоров","И.С.", "4П4", new int[] {1,2,3,4,5});
		
		
		// Создайте массив из десяти элементов такого типа
		
		Student [] arr = getArrayOfAllStudent();
		
		// Добавьте возможность вывода фамилий и
		// номеров групп студентов, имеющих оценки, равные только 9 или 10.
		
		printTheBestStudents(9); // в аргумент ставим нужную отметку
	}
}