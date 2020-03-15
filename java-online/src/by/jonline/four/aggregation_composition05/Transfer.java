package by.jonline.four.aggregation_composition05;

public enum Transfer {
	PLANE(0.25, "самолет"), BUS(0.08, "автобус"), NONE(0, "без трансфера");
	
	private double price;
	private String name;
	
	Transfer(double price, String name){
		this.price = price;
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
}
