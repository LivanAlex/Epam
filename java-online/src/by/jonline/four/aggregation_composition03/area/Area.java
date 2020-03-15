package by.jonline.four.aggregation_composition03.area;

import by.jonline.four.aggregation_composition03.town.Town;

public abstract class Area {
	protected Town town;
	protected String name;
	protected int area;
	
	public Town getTown() {
		return town;
	}
	public void setTown(Town town) {
		this.town = town;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void showTown() {
		System.out.println(town.getName());
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	
	
}
