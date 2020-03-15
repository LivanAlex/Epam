package by.jonline.four.aggregation_composition05;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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
		out();
	}
	

	public void sortTours() {
		System.out.println(SORTED);
		if(counter == 0) {
			buildTours();
		}
		
		TourByPriceComparator comp = new TourByPriceComparator(transfer, food);
		
		toMap(tours.values().stream().sorted(comp).collect(Collectors.toList()));
		
		out();
	}

	private void buildTours() {
		counter = 0;
		TourStorage.getTours().stream()
		.filter(tour -> checkDuration(tour.getDuration()))
		.filter(tour -> checkTransfer(tour.getTransfer()))
		.filter(tour -> checkFood(tour.getFood()))
		.filter(tour -> checkType(tour.getType()))
		.forEach(tour -> toMap(tour));
	}

	private void out() {
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
		String duration = days(dur);
		
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
	
	private void toMap(Tour tour) {
		tours.put(counter++, tour);
	}
	
	private void toMap(List<Tour> set) {
		tours.clear();
		counter = 0;
		for (Tour t : set) {
			tours.put(counter++, t);
		}
	}

	private boolean checkDuration(int duration) {
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
	
	private boolean checkType(Type type) {
		if (this.type == null) {
			return true;
		}
		if (type.equals(this.type)) {
			return true;
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

	public void choise(int i) {
		
		Tour tour = tours.get(i-1);
		
		System.out.println("Вы выбрали:");
		System.out.println(tour.getType().getName());
		System.out.println(tour.getName());
		System.out.printf("длительность: %s\n", days(tour.getDuration()));
		System.out.printf("стоимость тура составляет: %d\n", tour.getPrice() * tour.getDuration());
		
		if(tour.getFood().length == 1 && tour.getFood().equals(Food.NONE)) {
			System.out.printf("Для этого тура питание не пердусмотрено");
		} else {
			System.out.println("для тура доступны следующие варианты питания:");
			for (int j = 0; j < tour.getFood().length; j++) {
				System.out.println(tour.getFood()[j].getName() + " - цена: " + tour.getFood()[j].getPrice() * tour.getDuration());
			}
		}
		
		System.out.println("для тура доступны следующие варианты трансфера:");
		for (int j = 0; j < tour.getTransfer().length; j++) {
			System.out.println(tour.getTransfer()[j].getName() + " - цена: " + (int)(tour.getTransfer()[j].getPrice() * tour.getDistance()));
		}
		
		
	}
	
}
