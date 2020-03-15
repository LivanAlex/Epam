package by.jonline.four.class04;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class TrainLogic {
	
	static private ArrayList <Train> listOfTrains = new ArrayList <>();
	
	/** Adds a new train in ArrayList listOfTrains */
	public static void setTrain (Train train) {
		listOfTrains.add(train);
	}
	
	/** Sorts ArrayList listOfTrains in ascending order by "int TrainNum" field*/
	public static void sotrUpTrainByNum() {
		listOfTrains.sort(Comparator.comparing(Train::getTrainNum));
	}
	
	/** Sorts ArrayList listOfTrains in descending order by "int TrainNum" field*/
	public static void sotrDownTrainByNum() {
		listOfTrains.sort(Comparator.comparing(Train::getTrainNum).reversed());
	}
	
	/** Sorts ArrayList listOfTrains in ascending order by "String Time" field*/
	public static void sotrUpTrainByStation() {
		listOfTrains.sort(Comparator.comparing(Train::getStation).thenComparing(Train::getTime));
	}
	
	/** Sorts ArrayList listOfTrains in descending order by "String Time" field*/
	public static void sotrDownTrainByStation() {
		listOfTrains.sort(Comparator.comparing(Train::getStation).reversed().thenComparing(Train::getTime));
	}

	/** 
	 * Prints "String message"
	 * and TrainNum Station Time fields of all trains in listOfTrains
	 */
	public static void printAllTrains(String message) {
		System.out.println(message);
		printAllTrains();
	}
	
	/** Prints TrainNum Station Time fields of all trains in listOfTrains */
	public static void printAllTrains() {
		for (Train train : listOfTrains) {
			System.out.format("%-3d%10s%7s\n", train.getTrainNum(), train.getStation(), train.getTime());	
		}
		System.out.println("");
	}
	
	/**
	 * Prints TrainNum Station Time fields of train of listOfTrains ArrayList
	 * witch have TrainNum same as "int num"
	 * if train with "int num" such as TrainNum doesn't exist
	 * it will print messge "this train doesn't exist"
	 */
	public static void getInfoOfTrain(int num) {
		System.out.format("информация о поезде под номером %d:\n", num);
		boolean isExist = false;
		for (Train train : listOfTrains) {
			if (train.getTrainNum() == num) {
				System.out.format("%-3d%10s%7s\n", train.getTrainNum(), train.getStation(), train.getTime());
				isExist = true;
			}
		}
		if (!isExist) {
			System.out.print("нет такого поезда!\n");
		}
		System.out.println("");
	}
}
