package by.jonline.four.aggregation_composition05;

import java.util.Comparator;
import java.util.HashMap;

import static by.jonline.four.aggregation_composition05.Messages.*;

public class UserChoise {
	private int durationStart;
	private int durationFinish;
	private Transfer transfer;
	private Food food;
	private Type type;
	
	private HashMap<Integer, Tour> tours;
	private int counter;
	
	public UserChoise() {
		tours = new HashMap<>();
	}

	public void setDuration(int start, int finish) {
		durationStart = start;
		durationFinish = finish;
	}

	public void setTransfer(Transfer transfer) {
		this.transfer = transfer;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void showAll() {
		buildTours();
		System.out.printf(TOUR_INFO_FIELD, INDEX, TYPE, NAME, DURATION, FOOD, TRANSFER, PRICE);
		System.out.println(INFO_FIELD_LINE);
		tours.keySet().stream().forEach(key -> show(key));
		System.out.println();
		
		
	}
	

	private void show(Integer i) {
		
		Tour tour = tours.get(i);
		
		String index = i.toString();
		String type = tour.getType().getName();
		String name = tour.getName();
		int dur = tour.getDuration();
		String duration = dur + " дней";
		
		String food;
		int foodPrice;
		if(this.food == null) {
			food = tour.getFood()[0].getName();
			foodPrice = tour.getFood()[0].getPrice();
		} else {
			food = this.food.getName();
			foodPrice = this.food.getPrice();
		}
		
		double transferPrice;
		String transfer;
		if(this.transfer == null) {
			transfer = tour.getTransfer()[0].getName();
			transferPrice = tour.getTransfer()[0].getPrice();
		} else {
			transfer = this.transfer.getName();
			transferPrice = this.transfer.getPrice();
		}

		
		int pr = (tour.getPrice() + foodPrice) * dur + (int) (transferPrice * tour.getDistance());
		String price = "" + pr;
		System.out.printf(TOUR_INFO_FIELD, index, type, name, duration, food, transfer, price);
	}
	
	private void buildTours() {
		counter = 0;
		TourStorage.getTours().stream()
		.filter(tour -> duration(tour.getDuration()))
		.filter(tour -> checkTransfer(tour.getTransfer()))
		.filter(tour -> checkFood(tour.getFood()))
		.filter(tour -> checkType(tour.getType()))
		.forEach(tour -> toMap(tour));
	}
	
	public void sortTours() {
		if(counter == 0) {
			buildTours();
		}
		tours.values().stream().sorted(Comparator.comparing(Tour::getPrice)).forEach(tour -> toMap(tour));
		
		
		System.out.printf(TOUR_INFO_FIELD, INDEX, TYPE, NAME, DURATION, FOOD, TRANSFER, PRICE);
		System.out.println(INFO_FIELD_LINE);
		tours.keySet().stream().forEach(key -> show(key));
		System.out.println();
	}
	
	private void toMap(Tour tour) {
		tours.put(counter++, tour);
	}

	private boolean duration(int duration) {
		if(durationStart == 0 && durationFinish == 0) {
			return true;
		}
		if (durationFinish == 0 && duration > durationStart) {
			return true;
		}
		if (durationStart == 0 && duration < durationFinish) {
			return true;
		}
		return false;
	}

	private boolean checkTransfer(Transfer[] source) {
		if (transfer == null) {
			return true;
		}
		for (int i = 0; i < source.length; i++) {
			if(source[i].equals(transfer)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkFood(Food[] source) {
		if (food == null) {
			return true;
		}
		for (int i = 0; i < source.length; i++) {
			if(source[i].equals(food)) {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkType(Type type) {
		if (this.type == null) {
			return true;
		}
		if (type.equals(this.type)) {
			return true;
		}
		return false;
	}
	
}
