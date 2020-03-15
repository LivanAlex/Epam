package by.jonline.four.class03;

import java.util.ArrayList;
import java.util.List;

public abstract class StudentLogic {
	
	private static List <Student> listOfAllStudent = new ArrayList<>();
	
	
	/** Adds a new student to list of all students */
	public static void addToArray(Student student) {
		listOfAllStudent.add(student);
	}
	
	
	/** Creates an array of all students from list of all students */
	public static Student [] getArrayOfAllStudent() {
		return listOfAllStudent.toArray(new Student [listOfAllStudent.size()]);
	}
	
	
	/**
	 * Prints students from list of all students who have marks at "int [] marks" array
	 * equal and more than "goodMark"
	 */
	public static void printTheBestStudents(int goodMark) {
		String highMark = goodMark == 10 ? ":\n" : " и выше:\n";
		System.out.format("студенты, оценки которых равны %d%s", goodMark, highMark);
		boolean isExist = false;
		for (Student student : listOfAllStudent) {
			boolean isGood = true;
			for (int i : student.getMarks()) {
				if (i < goodMark) {
				isGood = false;
				}
			}
			if (isGood) {
				printStudent(student, goodMark);
				isExist = true;
			}
		}
		if (!isExist) {
			System.out.println("отсутствуют");
		}
	}
	
	
	private static void printStudent(Student student, int goodMark) {
		System.out.format("%-10s %s\n", student.getSurname(), student.getGroup());
	}
}
