package by.jonline.four.aggregation_composition05;

import java.util.ArrayList;

public abstract class TourStorage {
	
	private static ArrayList<Tour> tours;

	public static void add(Tour tour) {
		if(tours == null) {
			tours = new ArrayList<>();
		}
		tours.add(tour);
	}

	public static ArrayList<Tour> getTours() {
		return tours;
	}
}
