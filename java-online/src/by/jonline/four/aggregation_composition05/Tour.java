package by.jonline.four.aggregation_composition05;

public class Tour {
	
	private String name;
	private int distance;
	private int duration;
	private int price;
	private Transfer[] transfer;
	private Food[] food;
	private Type type;
	
	public Tour (String name, int distance, int duration, int price, Transfer[] transfer, Food[] food, Type type) {
		this.name = name;
		this.distance = distance;
		this.duration = duration;
		this.price = price;
		this.transfer = transfer;
		this.food = food;
		this.type = type;
		
		TourStorage.add(this);
	}

	public String getName() {
		return name;
	}

	public int getDistance() {
		return distance;
	}

	public int getDuration() {
		return duration;
	}
	
	public int getPrice() {
		return price;
	}

	public Transfer[] getTransfer() {
		return transfer;
	}

	public Food[] getFood() {
		return food;
	}

	public Type getType() {
		return type;
	}
	
	
}
