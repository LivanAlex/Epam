package by.jonline.four.aggregation_composition03.area;

import java.util.HashSet;

import by.jonline.four.aggregation_composition03.town.Type;

public class Region extends Area{
	
	private HashSet<District> districts;

	public Region(String name) {
		this.name = name;	
	}
	
	public void addDistrict(District district) {
		if (districts == null) {
			districts = new HashSet<District>();
		}
		districts.add(district);
		if(district.town.getType() == Type.CITY ||
				district.town.getType() == Type.CAPITAL) {
			this.town = district.town;
		}
	}
	
	public int getArea() {
		area = 0;
		for (District d : districts) {
			area += d.area;
		}
		return area;
	}
}
