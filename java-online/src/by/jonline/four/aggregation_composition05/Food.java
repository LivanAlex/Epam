package by.jonline.four.aggregation_composition05;

public enum Food {
	ALL(150, "все включено"), ONE_TIME(50, "одноразовое"), TWO_TIME(100, "двухразовое"), NONE(0, "без питания");
	
	private int price;
	private String name;
	
	Food(int price, String name) {
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
}
