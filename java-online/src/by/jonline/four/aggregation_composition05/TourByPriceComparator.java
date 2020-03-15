package by.jonline.four.aggregation_composition05;

import java.util.Comparator;

public class TourByPriceComparator implements Comparator<Tour> {

	private Transfer transfer;
	private Food food;
	
	public TourByPriceComparator(Transfer transfer, Food food) {
		this.transfer = transfer;
		this.food = food;
	}

	@Override
	public int compare(Tour o1, Tour o2) {
		
		int o1FoodPrice = foodPrice(o1);
		int o2FoodPrice = foodPrice(o2);
		
		double o1TransferPrice = transferPrice(o1);
		double o2TransferPrice = transferPrice(o2);
		
		int o1Prise = (o1.getPrice() + o1FoodPrice) * o1.getDuration() + (int) (o1TransferPrice * o1.getDistance());
		int o2Prise = (o2.getPrice() + o2FoodPrice) * o2.getDuration() + (int) (o2TransferPrice * o2.getDistance());
		
		return o1Prise - o2Prise;
	}


	private double transferPrice(Tour tour) {
		double transferPrice;
		if(this.transfer == null) {
			transferPrice = tour.getTransfer()[0].getPrice();
		} else {
			transferPrice = this.transfer.getPrice();
		}
		return transferPrice;
	}

	private int foodPrice(Tour tour) {
		int foodPrice;
		if(this.food == null) {
			foodPrice = tour.getFood()[0].getPrice();
		} else {
			foodPrice = this.food.getPrice();
		}
		return foodPrice;
	}

}
