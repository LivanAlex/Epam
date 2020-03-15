package by.jonline.four.aggregation_composition03.area;

import by.jonline.four.aggregation_composition03.town.Town;

public class District extends Area {

	public District(String name, Town town, int area) {
		this.name = name;
		this.town = town;
		this.area = area;
	}
}
