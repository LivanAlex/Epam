package by.jonline.four.aggregation_composition03.area;

import java.util.HashSet;

import by.jonline.four.aggregation_composition03.town.Type;

public class Country extends Area{
	
	private HashSet<Region> regions;
	
	public Country(String name) {
		this.name = name;	
	}
	
	public void addRegion(Region region) {
		if (regions == null) {
			regions = new HashSet<Region>();
		}
		regions.add(region);
		if(region.town.getType() == Type.CAPITAL) {
			super.town = region.town;
		}
	}
	
	public void showCapital() {
		System.out.printf("Столица государства \"%s\": ", name);
		showTown();
	}
	
	public void showRegionalCitys() {
		System.out.println("Областные центры:");
		for (Region region : regions) {
			region.showTown();
		}
	}
	
	public int getArea() {
		area = 0;
		for (Region r : regions) {
			area += r.getArea();
		}
		return area;
	}
	
	public void showArea() {
		System.out.printf("Площадь государства \"%s\": %d км²",name, getArea());
	}
	
	public void showRegCount() {
		System.out.printf("Колличество областей государства \"%s\": %d\n", name, regions.size());
	}
}
